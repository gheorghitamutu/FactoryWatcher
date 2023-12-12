using Microsoft.Extensions.Logging;
using System.Reflection;

namespace FactoryWatcher.BusinessLogic
{
    public class BaseServiceDispatch<T>  : DispatchProxy where T: class
    {
        private ILogger<BaseServiceDispatch<T>> _logger;

        public T Target { get; set; }
        public BaseServiceDispatch()
        {
            // This constructor is required by DispatchProxy
            // It's okay to leave it empty or add any necessary initialization logic
        }

        // Inject the logger through the constructor
        public BaseServiceDispatch(ILogger<BaseServiceDispatch<T>> logger)
        {
            _logger = logger ?? throw new ArgumentNullException(nameof(logger));
        }

        public static T Create(T target, ILogger<BaseServiceDispatch<T>> logger)
        {
            var proxy = Create<T, BaseServiceDispatch<T>>()
                as BaseServiceDispatch<T>;

            proxy.Target = target;
            proxy._logger = logger;

            return proxy as T;
        }

        protected override object? Invoke(MethodInfo? targetMethod, object?[]? args)
        {
            try
            {
                // Log information about the invoked method and its arguments
                string logMessage = $"Logging: Method = {targetMethod?.Name}, Arguments = [{string.Join(", ", args ?? Array.Empty<object?>())}]";

                // Use the logger to log the information
                _logger.LogInformation(logMessage);

                // Invoke the target method
                return targetMethod?.Invoke(Target, args);
            }
            catch (Exception ex)
            {
                // Log any exceptions that occur during method invocation
                _logger.LogError($"Error invoking method {targetMethod?.Name}: {ex.Message}");
                throw;
            }
        }
    }
}
