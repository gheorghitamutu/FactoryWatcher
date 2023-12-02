using AutoMapper;
using AutoMapper.EquivalencyExpression;
using FactoryWatcher.BusinessLogic.Mappers;

namespace LabsAndCoursesManagement.BusinessLogic.Mappers
{
    public static class AutoMapperConfig
    {
        public static MapperConfiguration Configure()
        {
            var config = new MapperConfiguration(cfg =>
            {
                cfg.AddProfile(new TemperatureMapper());
                //cfg.AddProfile(new UserMapper());
                //cfg.AddProfile(new LabMapper());
                //cfg.AddProfile(new StudentMapper());
                //cfg.AddProfile(new CourseMapper());
                //cfg.AddCollectionMappers();
            }
            );
            return config;
        }
    }
}
