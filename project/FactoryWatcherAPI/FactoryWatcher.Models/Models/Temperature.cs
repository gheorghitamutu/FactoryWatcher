namespace FactoryWatcher.Models.Models
{
    public class Temperature
    {
        public Temperature()
        {
            Id = Guid.NewGuid();
        }
        public Guid Id { get; protected set; }
        public string SensorName { get; set; }

        public double Value { get; set; }
    }
}
