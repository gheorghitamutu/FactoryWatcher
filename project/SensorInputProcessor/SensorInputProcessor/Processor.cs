using System;
using Azure.Messaging.EventHubs;
using Microsoft.Azure.Functions.Worker;
using Microsoft.Extensions.Logging;
using Sensor;
using Microsoft.Azure.Cosmos;
using Google.Protobuf;

namespace SensorInputProcessor
{
    public class Processor
    {
        private readonly ILogger<Processor> _logger;

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
                _logger.LogError($"Failed: {ex.ResponseBody}.");
                _logger.LogError($"Failed: {humidity}.");
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
                _logger.LogError($"Failed: {ex.ResponseBody}.");
                _logger.LogError($"Failed: {temperature}.");
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
                _logger.LogError($"Failed: {ex.ResponseBody}.");
                _logger.LogError($"Failed: {pressure}.");
            }
        }

        public async Task AddSensorDataToDatabase(SensorData sensor) {
            // The Azure Cosmos DB endpoint for running this sample.
            string EndpointUri = "https://cosmosrgeastusdc1c20c5-1b8b-4fd4-9798db.documents.azure.com:443/";

            // The primary key for the Azure Cosmos account.
            string PrimaryKey = "KLN1hg9CKqXUOVua1ZsN1veC5LVmIELeojmMh5HrnLT3C3iOxMFHAY7ScOcjqxQvVH5A17PddmAbACDbhZwEbQ==";

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
            }
        }
    }
}
