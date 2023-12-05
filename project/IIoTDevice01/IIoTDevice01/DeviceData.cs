using System;
using Microsoft.Azure.Functions.Worker;
using Microsoft.Azure.Devices.Client;
using Microsoft.Extensions.Logging;
using Google.Protobuf;
using Equipment;
using Sensor;
using System.Text;
using System.Threading.Tasks;
using Microsoft.Azure.WebJobs;
using Google.Protobuf.WellKnownTypes;

namespace IIoTDevice01
{
    public class DeviceData
    {
        private readonly ILogger _logger;

        public DeviceData(ILoggerFactory loggerFactory)
        {
            _logger = loggerFactory.CreateLogger<DeviceData>();
        }

        [Function(nameof(DeviceData))]
        public async Task Run([TimerTrigger("0 */5 * * * *")] TimerInfo myTimer)
        {
            _logger.LogInformation($"C# Timer trigger function executed at: {DateTime.Now}");

            // do not use connection string in production!!!
            DeviceClient iotDevice =
                DeviceClient.CreateFromConnectionString(
                    "HostName=iiot-hub.azure-devices.net;DeviceId=iot_device_01;SharedAccessKey=SQrZiCs7THRIS14XkI5GnetjQ44XAcsu2AIoTKM8l8E=");

            var response = GetSensorResponse();
            await SendSensor(iotDevice, response);
            _logger.LogInformation($"Data sent to IoT Event Hub: {response} at: {DateTime.Now}");

            if (myTimer.ScheduleStatus is not null)
            {
                _logger.LogInformation($"Next timer schedule at: {myTimer.ScheduleStatus.Next}");
            }
        }

        public static Equipment.Equipment GenerateEquipmentResponse()
        {
            return new Equipment.Equipment
            {
                Id = 1,
                EquipmentId = 1,
                Status = EquipmentStatus.Ok,
                Message = "Test message",
                Timestamp = Timestamp.FromDateTime(DateTime.UtcNow),

            };
        }

        public static SensorData GetSensorResponse()
        {
            return new SensorData
            {
                Uuid = "22309216-3531-4f53-b8e5-e2453aa44cea", // Guid.NewGuid().ToString(),
                SensorId = 1,
                Timestamp = Timestamp.FromDateTime(DateTime.UtcNow),
                ExtraInfo = "Test message",
                Status = Status.Ok,
                Humidity = 0.2f,
                Temperature = 0.5f,
                Pressure = 0.3f,
            };
        }

        private static async Task SendEquipment(DeviceClient iotDevice, Equipment.Equipment equipment)
        {
            // Create JSON message
            var message = new Message(Encoding.UTF8.GetBytes(equipment.ToString()))
            {
                // Add a custom application property to the message.
                // An IoT hub can filter on these properties without access to the message body.
                // message.Properties.Add("temperatureAlert", (currentTemperature > 30) ? "true" : "false");
                ContentType = "application/json",
                ContentEncoding = "utf-8"
            };

            // Send the telemetry message
            await iotDevice.SendEventAsync(message).ConfigureAwait(false);
            Console.WriteLine("{0} > Sending message: {1}", DateTime.Now, equipment.ToString());

            await Task.Delay(TimeSpan.FromSeconds(1)).ConfigureAwait(false);
        }

        private static async Task SendSensor(DeviceClient iotDevice, SensorData data)
        {
            // Create JSON message
            var message = new Message(Encoding.UTF8.GetBytes(data.ToString()))
            {
                // Add a custom application property to the message.
                // An IoT hub can filter on these properties without access to the message body.
                // message.Properties.Add("temperatureAlert", (currentTemperature > 30) ? "true" : "false");
                ContentType = "application/json",
                ContentEncoding = "utf-8"
            };

            // Send the telemetry message
            await iotDevice.SendEventAsync(message).ConfigureAwait(false);
            Console.WriteLine("{0} > Sending message: {1}", DateTime.Now, data.ToString());

            await Task.Delay(TimeSpan.FromSeconds(1)).ConfigureAwait(false);
        }
    }
}
