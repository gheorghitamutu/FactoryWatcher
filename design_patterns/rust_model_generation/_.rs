#[allow(clippy::derive_partial_eq_without_eq)]
#[derive(Clone, PartialEq, ::prost::Message)]
pub struct AlarmEvent {
    #[prost(int32, tag = "1")]
    pub alarm_id: i32,
    #[prost(string, tag = "2")]
    pub alarm_description: ::prost::alloc::string::String,
    /// Additional alarm event fields can be added here
    #[prost(int64, tag = "3")]
    pub timestamp: i64,
}
#[allow(clippy::derive_partial_eq_without_eq)]
#[derive(Clone, PartialEq, ::prost::Message)]
pub struct Equipment {
    #[prost(int32, tag = "1")]
    pub equipment_id: i32,
    #[prost(enumeration = "EquipmentStatus", tag = "2")]
    pub status: i32,
    /// Additional equipment status fields can be added here
    #[prost(string, tag = "3")]
    pub message: ::prost::alloc::string::String,
}
#[derive(Clone, Copy, Debug, PartialEq, Eq, Hash, PartialOrd, Ord, ::prost::Enumeration)]
#[repr(i32)]
pub enum EquipmentStatus {
    Ok = 0,
    Warning = 1,
    Error = 2,
}
impl EquipmentStatus {
    /// String value of the enum field names used in the ProtoBuf definition.
    ///
    /// The values are not transformed in any way and thus are considered stable
    /// (if the ProtoBuf definition does not change) and safe for programmatic use.
    pub fn as_str_name(&self) -> &'static str {
        match self {
            EquipmentStatus::Ok => "OK",
            EquipmentStatus::Warning => "WARNING",
            EquipmentStatus::Error => "ERROR",
        }
    }
    /// Creates an enum from field names used in the ProtoBuf definition.
    pub fn from_str_name(value: &str) -> ::core::option::Option<Self> {
        match value {
            "OK" => Some(Self::Ok),
            "WARNING" => Some(Self::Warning),
            "ERROR" => Some(Self::Error),
            _ => None,
        }
    }
}
#[allow(clippy::derive_partial_eq_without_eq)]
#[derive(Clone, PartialEq, ::prost::Message)]
pub struct Product {
    #[prost(int32, tag = "1")]
    pub product_id: i32,
    #[prost(string, tag = "2")]
    pub product_name: ::prost::alloc::string::String,
    #[prost(float, tag = "3")]
    pub weight: f32,
    /// Additional product information fields can be added here
    #[prost(int32, tag = "4")]
    pub quantity: i32,
}
#[allow(clippy::derive_partial_eq_without_eq)]
#[derive(Clone, PartialEq, ::prost::Message)]
pub struct ProductionLineInfo {
    #[prost(int32, tag = "1")]
    pub line_id: i32,
    /// Additional production line information fields can be added here
    #[prost(message, repeated, tag = "2")]
    pub products: ::prost::alloc::vec::Vec<Product>,
}
#[allow(clippy::derive_partial_eq_without_eq)]
#[derive(Clone, PartialEq, ::prost::Message)]
pub struct TemperatureData {
    #[prost(int32, tag = "1")]
    pub sensor_id: i32,
    #[prost(float, tag = "2")]
    pub temperature_celsius: f32,
    /// Additional sensor data fields can be added here
    #[prost(int64, tag = "3")]
    pub timestamp: i64,
}
