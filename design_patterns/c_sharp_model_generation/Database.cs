using Google.Protobuf;
using Microsoft.EntityFrameworkCore;

class Database : DbContext {
    protected override void OnConfiguring(DbContextOptionsBuilder optionsBuilder) {
        optionsBuilder.UseSqlite("Data Source=example.db");
    }

  public DbSet<AlarmEvent> AlarmEvents { get; set; }
  public DbSet<Equipment> Equipments { get; set; }
  public DbSet<ProductionLineInfo> ProductionLineInfos { get; set; }
  public DbSet<TemperatureData> TemperatureDatas { get; set; }
}