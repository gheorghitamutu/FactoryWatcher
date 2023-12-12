using Newtonsoft.Json;

namespace FactoryWatcher.Models.Models
{
    public class Temperature: BaseEntity
    {
        public Temperature()
        {
            Id = Guid.NewGuid();
        }

        [JsonProperty("value")]
        public double Value { get; private set; }

        public override string ToString()
        {
            return JsonConvert.SerializeObject(this, Formatting.Indented);
        }
    }
}
