﻿using Castle.DynamicProxy;
using FactoryWatcher.BusinessLogic;
using FactoryWatcher.DataAccess;
using FactoryWatcher.DataAccess.Repositories.Aspects;
using FactoryWatcher.DataAccess.Repositories.Implementations;
using FactoryWatcher.Models.Dtos;
using FactoryWatcher.Models.Models;
using Microsoft.Azure.Cosmos;
using Microsoft.Extensions.Options;

namespace FactoryWatcherAPI.Controllers
{
    //public static class Startup
    //{
    //    //public Startup(IConfiguration configuration)
    //    //{
    //    //    Configuration = configuration;
    //    //}

    //    //public IConfiguration Configuration { get; }

    //    public static IServiceCollection AddApplicationServices(this IServiceCollection services, IConfiguration configuration)
    //    {
    //        services.Configure<CosmosDbSettings>(configuration.GetSection("CosmosDbSettings"));

    //        services.AddSingleton<CosmosClient>(sp =>
    //        {
    //            var cosmosDbSettings = sp.GetRequiredService<IOptions<CosmosDbSettings>>().Value;

    //            var cosmosClient = new CosmosClient(
    //                cosmosDbSettings.EndpointUri,
    //                cosmosDbSettings.PrimaryKey,
    //                new CosmosClientOptions
    //                {
    //                    // Additional configuration options if needed
    //                });

    //            return cosmosClient;
    //        });

    //        // Register your repository
    //        //services.AddSingleton<RepositoryLoggingInterceptor>();
    //        //services.AddSingleton(provider =>
    //        //{
    //        //    var generator = ProxyGenerator();
    //        //    var loggingInterceptor = provider.GetRequiredService<RepositoryLoggingInterceptor>();

    //        //    generator.RegisterInterceptor<RepositoryLoggingInterceptor>(i => true);
    //        //    return generator;
    //        //});

    //        //services.AddScoped<ICosmosDbRepository<Temperature>>(provider =>
    //        //{
    //        //    var generator = provider.GetRequiredService<ProxyGenerator>();
    //        //    var loggingInterceptor = provider.GetRequiredService<RepositoryLoggingInterceptor>();
    //        //    var targetRepository = provider.GetRequiredService<TemperatureCosmosDbRepository>(); // Adjust this based on your actual repository class

    //        //    // Create a proxy for ICosmosDbRepository<Temperature> with the logging interceptor
    //        //    return generator.CreateInterfaceProxyWithTarget<ICosmosDbRepository<Temperature>>(targetRepository, loggingInterceptor);
    //        //});

    //        services.AddScoped<ICosmosDbRepository<Temperature>, CosmosDbRepository<Temperature>>();
    //        services.AddScoped<IBaseService<Temperature, CreateTemperatureDto>, BaseService<Temperature, CreateTemperatureDto>>();
    //        return services;
    //    }
    //}

    public static class ServiceCollectionExtensions
    {
        public static IServiceCollection AddApplicationServices(this IServiceCollection services, IConfiguration configuration)
        {
            services.Configure<CosmosDbSettings>(configuration.GetSection("CosmosDbSettings"));

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

            services.AddScoped<ICosmosDbRepository<Humidity>, CosmosDbRepository<Humidity>>();
            services.AddScoped<IBaseService<Humidity, CreateHumidityDto>, BaseService<Humidity, CreateHumidityDto>>();

            services.AddScoped<ICosmosDbRepository<Pressure>, CosmosDbRepository<Pressure>>();
            services.AddScoped<IBaseService<Pressure, CreatePressureDto>, BaseService<Pressure, CreatePressureDto>>();
            return services;
        }
    }

}
