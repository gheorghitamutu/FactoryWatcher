namespace FactoryWatcher.Models.Models
{
    public class Temperature
    {
        public Temperature()
        {
            Id = Guid.NewGuid();
        }

        public Guid Id { get; private set; }
        public string SensorName { get; private set; }

        public double Value { get; private set; }
    }
}
