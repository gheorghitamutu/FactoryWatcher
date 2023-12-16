using Microsoft.Azure.Devices.Client;
using Sensor;
using Google.Protobuf.WellKnownTypes;
using Google.Protobuf;
using System.Text;

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
                SensorId = 1,
                Timestamp = Timestamp.FromDateTime(DateTime.UtcNow),
                ExtraInfo = "Test message",
                Status = Status.Ok,
                Humidity = (float)rand.NextDouble(),
                Temperature = (float)rand.NextDouble(),
                Pressure = (float)rand.NextDouble(),
            };
        }

        public static async Task SendSensor(DeviceClient iotDevice, SensorData data)
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
