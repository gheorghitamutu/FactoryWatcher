using AutoMapper;
using FactoryWatcher.Models.Dtos;
using FactoryWatcher.Models.Models;

namespace FactoryWatcher.BusinessLogic.Mappers
{
    public class UserMapper : Profile
    {
        public UserMapper()
        {
            CreateMap<User, CreateUserDto>().ReverseMap();
        }
    }
}
