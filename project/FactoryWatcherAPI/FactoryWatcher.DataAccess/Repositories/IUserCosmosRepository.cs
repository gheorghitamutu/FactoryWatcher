using FactoryWatcher.Models.Models;
using Microsoft.Azure.Cosmos;

namespace FactoryWatcher.DataAccess.Repositories
{
    public interface IUserCosmosRepository
    {
        Task<ItemResponse<UserModel>> Add(UserModel item);
        Task<IEnumerable<UserModel>> GetAll();
        Task<ItemResponse<UserModel>> GetByIdAndPartitionKey(string id);
        Task<ItemResponse<UserModel>> Update(string id, UserModel item);
    }
}