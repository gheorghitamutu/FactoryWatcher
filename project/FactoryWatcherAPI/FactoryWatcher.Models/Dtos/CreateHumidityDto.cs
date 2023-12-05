using FactoryWatcher.Models.Models;

namespace FactoryWatcher.Models.Dtos
{
    public class CreateHumidityDto: DtoBaseEntity
    {
        public double Value { get; set; }
    }
}
