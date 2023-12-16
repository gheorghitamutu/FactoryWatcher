using Newtonsoft.Json;

namespace FactoryWatcher.Models.Models
{
    public class UserModel
    {
        [JsonProperty("id")]
        public Guid Id { get; protected set; } = Guid.NewGuid();
        [JsonProperty("user_name")]
        public string UserName { get; set; } = string.Empty;
        [JsonProperty("password_hash")]
        public byte[] PasswordHash { get; set; }
        [JsonProperty("password_salt")]
        public byte[] PasswordSalt { get; set; }

        [JsonProperty("refresh_token")]
        public string RefreshToken { get; set; } = string.Empty;
        [JsonProperty("token_created")]
        public DateTime TokenCreated { get; set; }
        [JsonProperty("token_expires")]
        public DateTime TokenExpires { get; set; }
    }
}
