using System;
using System.Collections.Generic;
using System.Linq;
using System.Reflection;
using System.Text;
using System.Threading.Tasks;

namespace FactoryWatcher.BusinessLogic
{
    public class BaseServiceDispatch<T> : DispatchProxy
    {
        public T Target { get; set; }

        public static T Create<T>(T target) where T : class
        {
            var proxy = Create<T, BaseServiceDispatch<T>>()
                as BaseServiceDispatch<T>;

            proxy.Target = target;

            return proxy as T;
        }

        protected override object? Invoke(MethodInfo? targetMethod, object?[]? args)
        {
            Console.WriteLine("Logging");
            return targetMethod.Invoke(Target, args);
        }
    }
}
