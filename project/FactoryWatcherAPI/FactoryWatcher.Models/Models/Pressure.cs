using Newtonsoft.Json;

namespace FactoryWatcher.Models.Models
{
    public class Pressure: BaseEntity
    {
        public Pressure()
        {
            Id = Guid.NewGuid();
        }

        [JsonProperty("value")]
        public double Value { get; private set; }
    }
}
