using FactoryWatcher.Models.Models;
using Newtonsoft.Json;

namespace FactoryWatcher.Models.Dtos
{
    public class CreateTemperatureDto: DtoBaseEntity
    {
        public double Value { get; set; }

        public override string ToString()
        {
            return JsonConvert.SerializeObject(this, Formatting.Indented);
        }
    }
}
