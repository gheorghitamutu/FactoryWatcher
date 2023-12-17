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

        public async Task AddSensorDataToDatabase(SensorData sensor) {
            // The Azure Cosmos DB endpoint for running this sample.
            string EndpointUri = "https://taipcosmosdb.documents.azure.com:443/";

            // The primary key for the Azure Cosmos account.
            string PrimaryKey = "XP9V3jmzRBJwQY85hqoWdPBXYXnknmWhy1t7A4rmNaRcRwMoIFW8VdgRYzktvXooTld4fbelD9OtACDb7X4HAw==";

            CosmosClient cosmosClient = new(
                EndpointUri, 
                PrimaryKey, 
                new CosmosClientOptions() { 
                    ApplicationName = "SensorDataProcessor" 
                    });

            // The name of the database and container we will create
            Database database = await cosmosClient.CreateDatabaseIfNotExistsAsync("SensorData");

            Humidity humidity = new Humidity {
                id = sensor.Uuid,
                sensor_id = sensor.SensorId.ToString(),
                timestamp = sensor.Timestamp.ToDateTime(),
                extra_info = sensor.ExtraInfo,
                status = sensor.Status,
                value = (float) sensor.Humidity
            };

            try {
                string containerId = "Humidities";
                Container container = await database.CreateContainerIfNotExistsAsync("Humidities", "/id");

                await container.CreateItemAsync(humidity);

                _logger.LogInformation($"Added item in database: {humidity}.");
            }
            catch (CosmosException ex) {
                _logger.LogError($"Failed: {ex.ResponseBody}.");
                _logger.LogError($"Failed: {humidity}.");
            }

            _logger.LogInformation($"C# IoT Hub trigger function processed a message: {sensor}");

            cosmosClient.Dispose();
        }

        [Function(nameof(Processor))]
        public async Task Run(
            [EventHubTrigger(
                "iothub-ehub-iiot-hub-25385295-39f1a2daba", 
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
