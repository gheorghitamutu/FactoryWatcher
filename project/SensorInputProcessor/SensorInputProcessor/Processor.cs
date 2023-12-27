using System;
using Azure.Messaging.EventHubs;
using Microsoft.Azure.Functions.Worker;
using Microsoft.Extensions.Logging;
using Sensor;
using Microsoft.Azure.Cosmos;
using Google.Protobuf;
using System.Collections.Generic;
using System.Threading.Tasks;
using Azure.Messaging.ServiceBus;

namespace SensorInputProcessor
{
    public class Processor
    {
        private readonly ILogger<Processor> _logger;

        // https://learn.microsoft.com/en-us/dotnet/api/microsoft.azure.cosmos.container.replacethroughputasync?view=azure-dotnet
        private readonly int throughPut = 1000;

        class Data {
            public string? id;
            public string? uuid;
            public int sensorId;
            public DateTime timestamp;
            public string? extraInfo;
            public Status status;
            public double humidity;
            public double temperature;
            public double pressure;
        }

        public Processor(ILogger<Processor> logger) {
            _logger = logger;
        }

        public async Task AddSensorDataToDatabase(SensorData sensor) {
            // The Azure Cosmos DB endpoint for running this sample.
            string EndpointUri = "https://iiotcosmos.documents.azure.com:443/";

            // The primary key for the Azure Cosmos account.
            string PrimaryKey = "HMws05hw9D6sJR19789K4sOukEVzaH2ytJlRjVWVfm5QHZPKe3SlZ9VQNFdwD3LQbcKnVHf0MXFgACDbWOUaQQ==";

            CosmosClient cosmosClient = new(
                EndpointUri, 
                PrimaryKey, 
                new CosmosClientOptions() { 
                    ApplicationName = "SensorDataProcessor",
                    ConnectionMode = ConnectionMode.Gateway 
                    /*
                        https://stackoverflow.com/questions/64512182/cosmos-db-the-request-failed-because-the-client-was-unable-to-establish-connect
                        ConnectionMode = ConnectionMode.Gateway is for Azure CosmosDB trial accounts.
                        Substatus: 20002; ActivityId: 65fc6fb7-2d79-447e-b31f-547a1b756f3b; 
                        Reason: (The request failed because the client was unable to establish connections to 3 endpoints across 1 regions. 
                        Please check for client resource starvation issues and verify connectivity between client and server. 
                        More info: https://aka.ms/cosmosdb-tsg-service-unavailable
                    */
                });

            // The name of the database and container we will create
            Database database = await cosmosClient.CreateDatabaseIfNotExistsAsync("SensorData");

            try {
                Container container = await database.CreateContainerIfNotExistsAsync("SensorData", "/id");
                // await container.ReplaceThroughputAsync(ThroughputProperties.CreateManualThroughput(throughPut));
                // await container.ReplaceThroughputAsync(ThroughputProperties.CreateAutoscaleThroughput(throughPut));

                int count = 0;
                QueryDefinition queryDefinition = new("SELECT VALUE COUNT(1) FROM c");
                var query = container.GetItemQueryIterator<int>(queryDefinition);
                while (query.HasMoreResults) {
                    FeedResponse<int> response = await query.ReadNextAsync();
                    count += response.Resource.FirstOrDefault();
                }

                var data = new Data {
                    id = Guid.NewGuid().ToString(),
                    uuid = sensor.Uuid,
                    sensorId = sensor.SensorId,
                    timestamp = sensor.Timestamp.ToDateTime(),
                    extraInfo = sensor.ExtraInfo,
                    status = sensor.Status,
                    humidity = sensor.Humidity,
                    temperature = sensor.Temperature,
                    pressure = sensor.Pressure
                };

                await container.CreateItemAsync(data);
                _logger.LogInformation($"Added item in database: {data}.");
            }
            catch (CosmosException ex) {
                _logger.LogError($"Failed: {ex.ResponseBody}.");
                _logger.LogError($"Failed: {sensor}.");
            }

            _logger.LogInformation($"C# IoT Hub trigger function processed a message: {sensor}");

            cosmosClient.Dispose();
        }

        public List<object> GetAlerts(SensorData sensor) {
            
            List<object> alerts = new List<object>();

            if (sensor.Humidity > 80 || sensor.Humidity < 20) {
                var alert = new {
                    sensor_id = sensor.SensorId.ToString(),
                    timestamp = sensor.Timestamp.ToDateTime(),
                    extra_info = sensor.ExtraInfo,
                    status = sensor.Status,
                    value = (float) sensor.Humidity
                };
                alerts.Add(alert);
                _logger.LogInformation($"C# IoT Hub trigger function enqueued an alert: {alert}");
            }

            if (sensor.Temperature > 30 || sensor.Temperature < 10) {
                var alert = new {
                    sensor_id = sensor.SensorId.ToString(),
                    timestamp = sensor.Timestamp.ToDateTime(),
                    extra_info = sensor.ExtraInfo,
                    status = sensor.Status,
                    value = (float) sensor.Temperature
                };
                alerts.Add(alert);
                _logger.LogInformation($"C# IoT Hub trigger function enqueued an alert: {alert}");
            }

            if (sensor.Pressure > 1015) {
                var alert = new {
                    sensor_id = sensor.SensorId.ToString(),
                    timestamp = sensor.Timestamp.ToDateTime(),
                    extra_info = sensor.ExtraInfo,
                    status = sensor.Status,
                    value = (float) sensor.Pressure
                };
                alerts.Add(alert);
                _logger.LogInformation($"C# IoT Hub trigger function enqueued an alert: {alert}");
            }

            return alerts;
        }

        public class TriggerServiceBusFunctionOutput
        {
            [ServiceBusOutput("alerts", Connection = "SERVICE_BUS_CONNECTION_STRING")]
            public string? Alerts { get; set; }
        }

        public async Task SendToServiceBus(List<object> alerts) {
            _logger.LogInformation("Alerts: {alerts}", alerts);

            // https://ciaranodonnell.dev/posts/sending-to-azure-servicebus
            var connectionString = "Endpoint=sb://iiotsb.servicebus.windows.net/;SharedAccessKeyName=alert;SharedAccessKey=mLZju/1iinMUdi2277aJqW70alnq5pzSe+ASbGD7Cko=;EntityPath=alerts";
            ServiceBusClient client = new ServiceBusClient(connectionString);

            var queueOrTopicName = "alerts";
            var sender = client.CreateSender(queueOrTopicName);

            var alerts_message = string.Join("\n", alerts);
            await sender.SendMessageAsync(new ServiceBusMessage(alerts_message));
        }

        [Function(nameof(Processor))]
        public async Task Run(
            [EventHubTrigger(
                "iothub-ehub-iiot-main-25403933-cc1476135b", 
                Connection = "IOT_HUB_CONNECTION_STRING",
                ConsumerGroup = "$Default"
            )] EventData[] events) {
            foreach (EventData @event in events) {
                _logger.LogInformation("Event Body: {body}", @event.Body);
                _logger.LogInformation("Event Content-Type: {contentType}", @event.ContentType);

                var sd = SensorData.Parser.ParseFrom(@event.Body.ToArray());
                _logger.LogInformation("Received SensorData: {sensorData}", sd);

                await AddSensorDataToDatabase(sd);
                var alerts = GetAlerts(sd);
                if (alerts.Count > 0) {
                    await SendToServiceBus(alerts);
                }
            }
        }
    }
}
