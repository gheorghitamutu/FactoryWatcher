using Castle.DynamicProxy;
using Microsoft.Extensions.Logging;
using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace FactoryWatcher.DataAccess.Repositories.Aspects
{

    public class RepositoryLoggingInterceptor : IInterceptor
    {
        private readonly ILogger<RepositoryLoggingInterceptor> _logger;

        public RepositoryLoggingInterceptor(ILogger<RepositoryLoggingInterceptor> logger)
        {
            _logger = logger;
        }

        public void Intercept(IInvocation invocation)
        {
            try
            {
                _logger.LogInformation($"Calling {invocation.Method.Name} with arguments: {string.Join(", ", invocation.Arguments)}");

                invocation.Proceed(); // Call the actual method

                _logger.LogInformation($"Successfully called {invocation.Method.Name}. Result: {invocation.ReturnValue}");
            }
            catch (Exception ex)
            {
                _logger.LogError($"Error calling {invocation.Method.Name}: {ex}");
                throw;
            }
        }
    }

}
