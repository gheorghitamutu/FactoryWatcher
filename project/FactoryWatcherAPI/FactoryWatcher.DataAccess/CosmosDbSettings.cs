﻿namespace FactoryWatcher.DataAccess
{
    public class CosmosDbSettings
    {
        public string EndpointUri { get; set; }
        public string PrimaryKey { get; set; }
        public string DatabaseId { get; set; }
        public string ContainerId { get; set; }
        public string PartitionKey { get; set; }
    }
}
