using AutoMapper;
using FactoryWatcher.Models.Models;

namespace FactoryWatcher.BusinessLogic.Mappers
{
    public class SensorDataMapper : Profile
    {
        public SensorDataMapper()
        {
            CreateMap<SensorData, CreateSensorDataDto>().ReverseMap();
        }
    }
}
