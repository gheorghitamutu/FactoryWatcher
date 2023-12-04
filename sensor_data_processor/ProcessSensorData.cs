using System;
using Azure.Messaging.EventHubs;
using Microsoft.Azure.Functions.Worker;
using Microsoft.Extensions.Logging;

namespace sensor_data_processor
{
    public class ProcessSensorData
    {
        private readonly ILogger<ProcessSensorData> _logger;

        public ProcessSensorData(ILogger<ProcessSensorData> logger)
        {
            _logger = logger;
        }

        [Function(nameof(ProcessSensorData))]
        public async Task Run([
            EventHubTrigger("iothub-ehub-iiot-hub-25382143-7b64d27610", 
            Connection = "ConnectionString", 
            ConsumerGroup = "data_processor"
            )] EventData[] events)
        {
            foreach (EventData @event in events)
            {
                _logger.LogInformation("Event Body: {body}", @event.Body);
                _logger.LogInformation("Event Content-Type: {contentType}", @event.ContentType);
            }
        }
    }
}
