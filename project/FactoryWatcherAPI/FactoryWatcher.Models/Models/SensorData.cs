using FactoryWatcher.Models.Helpers;
using Newtonsoft.Json;

namespace FactoryWatcher.Models.Models
{
    public class SensorData: BaseEntity
    {
        public SensorData()
        {
            Id = Guid.NewGuid();
        }

        [JsonProperty("sensor_id")]
        public Guid SensorId { get; protected set; }

        [JsonProperty("timestamp")]
        public DateTime Timestamp { get; protected set; }


        [JsonProperty("extraInfo")]
        public String ExtraInfo { get; protected set; }


        [JsonProperty("status")]
        public Status Status { get; protected set; }

        [JsonProperty("humidity")]
        public float Humidity { get; protected set; }


        [JsonProperty("temperature")]
        public float Temperature { get; protected set; }


        [JsonProperty("pressure")]
        public float Pressure { get; protected set; }
    }
}




