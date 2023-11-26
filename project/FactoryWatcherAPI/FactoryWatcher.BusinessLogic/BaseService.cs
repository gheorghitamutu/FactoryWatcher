using AutoMapper;
using FactoryWatcher.Models.Helpers;
using LabsAndCoursesManagement.BusinessLogic.Mappers;
using Microsoft.Azure.Cosmos;
using System.Net;

namespace FactoryWatcher.BusinessLogic
{
    public class BaseService<T, TDto> : IBaseService<T, TDto> where T: class where TDto : class
    {
        protected readonly IMapper mapper;
        protected readonly IRepository<T> repository;

        public BaseService(IRepository<T> repository)
        {
            mapper = new AutoMapperBuilder().Build();
            this.repository = repository;
        }
        public async Task<ItemResponse<T>> Add(TDto dto, string partitionKey)
        {
            T entity = mapper.Map<T>(dto);
            return await repository.Add(entity, partitionKey);
        }

        public async Task<ItemResponse<T>> Delete(string id, string partitionKey)
        {
            return await repository.Delete(id, partitionKey);
        }

        public async Task<Result<IEnumerable<T>>> GetAll()
        {
            var data = await repository.GetAll();
            return Result<IEnumerable<T>>.Success(data);
        }

        public async Task<ItemResponse<T>> GetById(string id, string partitionKey)
        {
            return await repository.GetByIdAndPartitionKey(id, partitionKey);
        }

        public async Task<Result<T>> Update(string id, TDto dto, string partitionKey)
        {
            var entity = mapper.Map<T>(dto);

            var response = await repository.Update(id, entity, partitionKey);
            if (response == null)
            {
                return Result<T>.Failure(HttpStatusCode.NotFound, "Cannot find entity specified by id");
            }
            return Result<T>.Success(response);
        }
    }
}
