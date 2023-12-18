using FactoryWatcher.Models.Models;

namespace FactoryWatcher.Models.Dtos
{
    public class CreateTemperatureDto: DtoBaseEntity
    {
        public double Value { get; set; }
    }
}
