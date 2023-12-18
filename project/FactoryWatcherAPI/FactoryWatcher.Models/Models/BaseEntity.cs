using FactoryWatcher.Models.Helpers;
using Newtonsoft.Json;

namespace FactoryWatcher.Models.Models
{
    public abstract class BaseEntity
    {
        [JsonProperty("id")]
        public Guid Id { get; protected set; } 
        
        [JsonProperty("sensor_id")]
        public Guid SensorId { get; protected set; }

        [JsonProperty("timestamp")]
        public DateTime Timestamp { get; protected set; }


        [JsonProperty("extra_info")]
        public String ExtraInfo { get; protected set; }


        [JsonProperty("status")]
        public Status Status { get; protected set; }
    }
}




