using AutoMapper;
using FactoryWatcher.Models.Dtos;
using FactoryWatcher.Models.Models;

namespace FactoryWatcher.BusinessLogic.Mappers
{
    public class HumidityMapper : Profile
    {
        public HumidityMapper()
        {
            CreateMap<Humidity, CreateHumidityDto>().ReverseMap();
        }
    }
}
