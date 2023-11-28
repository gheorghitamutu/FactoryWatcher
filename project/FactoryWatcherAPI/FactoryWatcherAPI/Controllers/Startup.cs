using Castle.DynamicProxy;
using FactoryWatcher.BusinessLogic;
using FactoryWatcher.DataAccess;
using FactoryWatcher.Models.Dtos;
using FactoryWatcher.Models.Models;
using Microsoft.Azure.Cosmos;
using Microsoft.Extensions.Options;

namespace FactoryWatcherAPI.Controllers
{
    public class Startup
    {
        public Startup(IConfiguration configuration)
        {
            Configuration = configuration;
        }

        public IConfiguration Configuration { get; }

        public void ConfigureServices(IServiceCollection services)
        {
            services.Configure<CosmosDbSettings>(Configuration.GetSection("CosmosDbSettings"));

            services.AddSingleton<CosmosClient>(sp =>
            {
                var cosmosDbSettings = sp.GetRequiredService<IOptions<CosmosDbSettings>>().Value;

                var cosmosClient = new CosmosClient(
                    cosmosDbSettings.EndpointUri,
                    cosmosDbSettings.PrimaryKey,
                    new CosmosClientOptions
                    {
                        // Additional configuration options if needed
                    });

                return cosmosClient;
            });

            services.AddScoped<ICosmosDbRepository<Temperature>, CosmosDbRepository<Temperature>>();
            services.AddScoped<IBaseService<Temperature, CreateTemperatureDto>, BaseService<Temperature, CreateTemperatureDto>>();
        }

        public void Configure(IApplicationBuilder app, IWebHostEnvironment env)
        {
            if (env.IsDevelopment())
            {
                app.UseDeveloperExceptionPage();
            }

            app.UseRouting();

            app.UseEndpoints(endpoints =>
            {
                endpoints.MapControllers();
            });
        }
    }

}
