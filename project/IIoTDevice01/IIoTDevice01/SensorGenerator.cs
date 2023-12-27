using Microsoft.Azure.Devices.Client;
using Sensor;
using Google.Protobuf.WellKnownTypes;
using Google.Protobuf;
using System.Text;
using Microsoft.Extensions.Logging;

namespace IIoTDevice01
{
    public class SensorGenerator
    {
        static Random rand = new Random();

        public static SensorData GetSensorResponse()
        {
            return new SensorData
            {
                Uuid = "22309216-3531-4f53-b8e5-e2453aa44cea", // Guid.NewGuid().ToString(),
                SensorId = "00000000-0000-0000-0000-000000000000",
                Timestamp = Timestamp.FromDateTime(DateTime.UtcNow),
                ExtraInfo = "Test message",
                Status = Status.Ok,
                Humidity = rand.NextDouble() * 100.0f,
                Temperature = rand.NextDouble() * (100.0f - -100.0f) + -100.0f,
                Pressure = 1010.0f + rand.NextDouble() * 10.0f,
            };
        }

        public static async Task SendSensor(DeviceClient iotDevice, SensorData data, ILogger logger)
        {
            // Create JSON message
            var message = new Message(data.ToByteArray())
            {
                ContentType = "application/x-protobuf"
            };

            // Send the telemetry message
            await iotDevice.SendEventAsync(message).ConfigureAwait(false);
            logger.LogInformation("{0} > Sending message: {1}", DateTime.Now, data.ToString());

            await Task.Delay(TimeSpan.FromSeconds(1)).ConfigureAwait(false);
        }
    }
}
