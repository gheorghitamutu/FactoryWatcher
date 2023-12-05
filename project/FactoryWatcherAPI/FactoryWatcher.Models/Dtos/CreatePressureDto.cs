using FactoryWatcher.Models.Models;

namespace FactoryWatcher.Models.Dtos
{
    public class CreatePressureDto: DtoBaseEntity
    {
        public double Value { get; set; }
    }
}
