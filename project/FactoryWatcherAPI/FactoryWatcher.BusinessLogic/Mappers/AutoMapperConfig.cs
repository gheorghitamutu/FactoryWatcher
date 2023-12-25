using AutoMapper;
using FactoryWatcher.BusinessLogic.Mappers;

namespace LabsAndCoursesManagement.BusinessLogic.Mappers
{
    public static class AutoMapperConfig
    {
        public static MapperConfiguration Configure()
        {
            var config = new MapperConfiguration(cfg =>
            {
                cfg.AddProfile(new UserMapper());
                cfg.AddProfile(new SensorDataMapper());
                //cfg.AddProfile(new CourseMapper());
                //cfg.AddCollectionMappers();
            }
            );
            return config;
        }
    }
}
