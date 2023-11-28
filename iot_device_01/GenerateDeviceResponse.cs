using System;
using Microsoft.Azure.Functions.Worker;
using Microsoft.Extensions.Logging;

namespace iot_device_01
{
    public class GenerateDeviceResponse
    {
        private readonly ILogger _logger;

        public GenerateDeviceResponse(ILoggerFactory loggerFactory)
        {
            _logger = loggerFactory.CreateLogger<GenerateDeviceResponse>();
        }

        [Function("GenerateDeviceResponse")]
        public void Run([TimerTrigger("0 */5 * * * *")] TimerInfo myTimer)
        {
            _logger.LogInformation($"C# Timer trigger function executed at: {DateTime.Now}");

            DeviceClient iotDevice =
                DeviceClient.CreateFromConnectionString(
                    "HostName=iiot-main-hub.azure-devices.net;SharedAccessKeyName=iothubowner;SharedAccessKey=oRetTItYwDyD8kGsb4Zn8MO+8ZA0+uE0XAIoTC3z3bA=");
            
            if (myTimer.ScheduleStatus is not null)
            {
                _logger.LogInformation($"Next timer schedule at: {myTimer.ScheduleStatus.Next}");
            }
        }
    }
}
