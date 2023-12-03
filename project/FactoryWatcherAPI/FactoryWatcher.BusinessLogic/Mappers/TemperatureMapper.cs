using AutoMapper;
using FactoryWatcher.Models.Dtos;
using FactoryWatcher.Models.Models;

namespace FactoryWatcher.BusinessLogic.Mappers
{
    public class TemperatureMapper : Profile
    {
        public TemperatureMapper()
        {
            CreateMap<Temperature, CreateTemperatureDto>().ReverseMap();
        }
    }
}
