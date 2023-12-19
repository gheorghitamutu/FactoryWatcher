using System;
using Microsoft.Azure.Functions.Worker;
using Microsoft.Azure.Devices.Client;
using Microsoft.Extensions.Logging;
using Equipment;
using Sensor;
using System.Threading.Tasks;
using Microsoft.Azure.WebJobs;

namespace IIoTDevice01
{
    public class DeviceData
    {
        private readonly ILogger _logger;

        public DeviceData(ILoggerFactory loggerFactory) {
            _logger = loggerFactory.CreateLogger<DeviceData>();
        }

        [Function(nameof(DeviceData))]
        public async Task Run([TimerTrigger("0 */5 * * * *")] TimerInfo myTimer) {
            _logger.LogInformation($"C# Timer trigger function executed at: {DateTime.Now}");

            // do not use connection string in production!!!
            DeviceClient iotDevice =
                DeviceClient.CreateFromConnectionString(
                    //"HostName=iiot-hub.azure-devices.net;DeviceId=iot_device_01;SharedAccessKey=SQrZiCs7THRIS14XkI5GnetjQ44XAcsu2AIoTKM8l8E=");
                    "HostName=iiot-main-hub.azure-devices.net;DeviceId=iiot-device-01;SharedAccessKey=D5d2MnkaPpYi6QoY/QbvUL5jBVKZ36ZZaAIoTBGE+WM=");
            var response = SensorGenerator.GetSensorResponse();
            await SensorGenerator.SendSensor(iotDevice, response, _logger);
            _logger.LogInformation($"Data sent to IoT Event Hub: {response} at: {DateTime.Now}");

            if (myTimer.ScheduleStatus is not null) {
                _logger.LogInformation($"Next timer schedule at: {myTimer.ScheduleStatus.Next}");
            }
        }
    }
}
