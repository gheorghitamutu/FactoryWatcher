using AutoMapper;
using FactoryWatcher.Models.Dtos;
using FactoryWatcher.Models.Models;

namespace FactoryWatcher.BusinessLogic.Mappers
{
    public class PressureMapper : Profile
    {
        public PressureMapper()
        {
            CreateMap<Pressure, CreatePressureDto>().ReverseMap();
        }
    }
}
