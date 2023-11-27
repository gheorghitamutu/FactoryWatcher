using AutoMapper;
using FactoryWatcher.Models.Helpers;
using LabsAndCoursesManagement.BusinessLogic.Mappers;
using Microsoft.Azure.Cosmos;
using System.Net;

namespace FactoryWatcher.BusinessLogic
{
    public class BaseService<T, TDto> : IBaseService<T, TDto> where T : class where TDto : class
    {
        protected readonly IMapper mapper;
        protected readonly ICosmosDbRepository<T> repository;

        public BaseService(ICosmosDbRepository<T> repository)
        {
            mapper = new AutoMapperBuilder().Build();
            this.repository = repository;
        }
        public async Task<ItemResponse<T>> Add(TDto dto)
        {
            T entity = mapper.Map<T>(dto);
            return await repository.Add(entity);
        }

        //public async Task<ItemResponse<T>> Delete(string id)
        //{
        //    return await repository.Delete(id);
        //}

        public async Task<Result<IEnumerable<T>>> GetAll()
        {
            var result = await repository.GetAll();
            return Result<IEnumerable<T>>.Success(result);
        }

        public async Task<ItemResponse<T>> GetById(string id)
        {
            return await repository.GetByIdAndPartitionKey(id);
        }

        public async Task<Result<T>> Update(string id, TDto dto)
        {
            var entity = mapper.Map<T>(dto);

            var response = await repository.Update(id, entity);
            if (response == null)
            {
                return Result<T>.Failure(HttpStatusCode.NotFound, "Cannot find entity specified by id");
            }
            return Result<T>.Success(response);
        }
    }
}
