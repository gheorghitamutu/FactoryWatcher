using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace FactoryWatcher.Models.Models
{
    public abstract class BaseEntity
    {
        public Guid Id { get; protected set; } // Can be set by derived classes
    }
}
