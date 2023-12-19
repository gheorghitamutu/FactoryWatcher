using System;
using Azure.Messaging.EventHubs;
using Microsoft.Azure.Functions.Worker;
using Microsoft.Extensions.Logging;
using Sensor;
using Microsoft.Azure.Cosmos;
using Google.Protobuf;
using System.Collections.Generic;
using System.Threading.Tasks;
// using Microsoft.Azure.Functions.Worker.Extensions.ServiceBus;
using Azure.Messaging.ServiceBus;

namespace SensorInputProcessor
{
    public class Processor
    {
        private readonly ILogger<Processor> _logger;

        // https://learn.microsoft.com/en-us/dotnet/api/microsoft.azure.cosmos.container.replacethroughputasync?view=azure-dotnet
        private readonly int throughPut = 1400;

        public Processor(ILogger<Processor> logger) {
            _logger = logger;
        }

        public class Humidity 
        {
            public string? id { get; set; }
            public string? sensor_id { get; set; }
            public DateTime timestamp { get; set; }
            public string? extra_info { get; set; }
            public Status status { get; set; }
            public float value { get; set; }
        }

        public class Temperature 
        {
            public string? id { get; set; }
            public string? sensor_id { get; set; }
            public DateTime timestamp { get; set; }
            public string? extra_info { get; set; }
            public Status status { get; set; }
            public float value { get; set; }
        }

        public class Pressure 
        {
            public string? id { get; set; }
            public string? sensor_id { get; set; }
            public DateTime timestamp { get; set; }
            public string? extra_info { get; set; }
            public Status status { get; set; }
            public float value { get; set; }
        }

        public async Task AddHumidityFromSensorToDatabase(SensorData sensor, Database database) {
            Humidity humidity = new Humidity {
                id = sensor.Uuid,
                sensor_id = sensor.SensorId.ToString(),
                timestamp = sensor.Timestamp.ToDateTime(),
                extra_info = sensor.ExtraInfo,
                status = sensor.Status,
                value = (float) sensor.Humidity
            };

            try {
                Container container = await database.CreateContainerIfNotExistsAsync("Humidities", "/id");
                await container.ReplaceThroughputAsync(ThroughputProperties.CreateManualThroughput(throughPut));
                await container.ReplaceThroughputAsync(ThroughputProperties.CreateAutoscaleThroughput(throughPut));

                int count = 0;
                QueryDefinition queryDefinition = new("SELECT VALUE COUNT(1) FROM c");
                var query = container.GetItemQueryIterator<int>(queryDefinition);
                while (query.HasMoreResults) {
                    FeedResponse<int> response = await query.ReadNextAsync();
                    count += response.Resource.FirstOrDefault();
                }           
                humidity.id = $"{sensor.Uuid}-{count}";

                await container.CreateItemAsync(humidity);
                _logger.LogInformation($"Added item in database: {humidity}.");
            }
            catch (CosmosException ex) {
                //_logger.LogError($"Failed: {ex.ResponseBody}.");
                //_logger.LogError($"Failed: {humidity}.");
            }
        }

        public async Task AddTemperatureFromSensorToDatabase(SensorData sensor, Database database) {
            Temperature temperature = new Temperature {
                id = sensor.Uuid,
                sensor_id = sensor.SensorId.ToString(),
                timestamp = sensor.Timestamp.ToDateTime(),
                extra_info = sensor.ExtraInfo,
                status = sensor.Status,
                value = (float) sensor.Temperature
            };

            try {
                Container container = await database.CreateContainerIfNotExistsAsync("Temperatures", "/id");
                await container.ReplaceThroughputAsync(ThroughputProperties.CreateManualThroughput(throughPut));
                await container.ReplaceThroughputAsync(ThroughputProperties.CreateAutoscaleThroughput(throughPut));

                int count = 0;
                QueryDefinition queryDefinition = new("SELECT VALUE COUNT(1) FROM c");
                var query = container.GetItemQueryIterator<int>(queryDefinition);
                while (query.HasMoreResults) {
                    FeedResponse<int> response = await query.ReadNextAsync();
                    count += response.Resource.FirstOrDefault();
                }           
                temperature.id = $"{sensor.Uuid}-{count}";

                await container.CreateItemAsync(temperature);
                _logger.LogInformation($"Added item in database: {temperature}.");
            }
            catch (CosmosException ex) {
                //_logger.LogError($"Failed: {ex.ResponseBody}.");
                //_logger.LogError($"Failed: {temperature}.");
            }
        }

        public async Task AddPressureFromSensorToDatabase(SensorData sensor, Database database) {
            Pressure pressure = new Pressure {
                id = sensor.Uuid,
                sensor_id = sensor.SensorId.ToString(),
                timestamp = sensor.Timestamp.ToDateTime(),
                extra_info = sensor.ExtraInfo,
                status = sensor.Status,
                value = (float) sensor.Pressure
            };

            try {
                Container container = await database.CreateContainerIfNotExistsAsync("Pressures", "/id");
                await container.ReplaceThroughputAsync(ThroughputProperties.CreateManualThroughput(throughPut));
                await container.ReplaceThroughputAsync(ThroughputProperties.CreateAutoscaleThroughput(throughPut));

                int count = 0;
                QueryDefinition queryDefinition = new("SELECT VALUE COUNT(1) FROM c");
                var query = container.GetItemQueryIterator<int>(queryDefinition);
                while (query.HasMoreResults) {
                    FeedResponse<int> response = await query.ReadNextAsync();
                    count += response.Resource.FirstOrDefault();
                }           
                pressure.id = $"{sensor.Uuid}-{count}";

                await container.CreateItemAsync(pressure);
                _logger.LogInformation($"Added item in database: {pressure}.");
            }
            catch (CosmosException ex) {
                //_logger.LogError($"Failed: {ex.ResponseBody}.");
                //_logger.LogError($"Failed: {pressure}.");
            }
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

            await AddHumidityFromSensorToDatabase(sensor, database);
            await AddTemperatureFromSensorToDatabase(sensor, database);
            await AddPressureFromSensorToDatabase(sensor, database);

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

        // [ServiceBusOutput("alerts", Connection = "SERVICE_BUS_CONNECTION_STRING", EntityType = ServiceBusEntityType.Queue)]
        public async Task SendToServiceBus(List<object> alerts) {
            _logger.LogInformation("Alerts: {alerts}", alerts);

            // https://ciaranodonnell.dev/posts/sending-to-azure-servicebus
            var connectionString = "Endpoint=sb://iiotsb.servicebus.windows.net/;SharedAccessKeyName=alert;SharedAccessKey=mLZju/1iinMUdi2277aJqW70alnq5pzSe+ASbGD7Cko=;EntityPath=alerts";
            ServiceBusClient client = new ServiceBusClient(connectionString);

            var queueOrTopicName = "alerts";
            var sender = client.CreateSender(queueOrTopicName);

            var alerts_message = string.Join(", ", alerts);
            await sender.SendMessageAsync(new ServiceBusMessage(alerts_message));
        }

        [Function(nameof(Processor))]
        // [ServiceBusOutput("alerts", Connection = "SERVICE_BUS_CONNECTION_STRING")]
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
