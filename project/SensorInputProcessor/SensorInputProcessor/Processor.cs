using System;
using Azure.Messaging.EventHubs;
using Microsoft.Azure.Functions.Worker;
using Microsoft.Extensions.Logging;
using Sensor;

namespace SensorInputProcessor
{
    public class Processor
    {
        private readonly ILogger<Processor> _logger;

        public Processor(ILogger<Processor> logger)
        {
            _logger = logger;
        }

        [Function(nameof(Processor))]
        public void Run(
            [EventHubTrigger(
                "iothub-ehub-iiot-hub-25385295-39f1a2daba", 
                Connection = "IOT_HUB_CONNECTION_STRING",
                ConsumerGroup = "$Default"
            )] EventData[] events)
        {
            foreach (EventData @event in events)
            {
                _logger.LogInformation("Event Body: {body}", @event.Body);
                _logger.LogInformation("Event Content-Type: {contentType}", @event.ContentType);

                var sd = SensorData.Parser.ParseFrom(@event.Body.ToArray());
                _logger.LogInformation("SensorData: {sensorData}", sd);
            }
        }
    }
}
