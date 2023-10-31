fn main() {
    prost_build::compile_protos(&[
            "alarm_system_event.proto", 
            "equipment_status.proto", 
            "product_line_information.proto", 
            "sensor_data.proto"], 
            &["../protobuf_models"])
        .unwrap();
}
