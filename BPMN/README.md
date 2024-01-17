The BPMN ilustrates/describes the procces of processing a IoT node output.

The output is sent in the "ML Malfunction Detection" Layer and is categorised as an error or as an normal output.

- If it is a normal output it is inseted in the database and the training data not the "ML Malfunction Detection".

- If it is categorised as an error it goes to the "Factory Component" Layer where an alert is generated from it.

The alert is logged as a foctory specific alert and sent to the "Email System" Layer. There an email is generated and sent to the factory representatives.

![Diagram](./BPMN%20Diagram%20for%20detecting%20and%20sending%20alerts.svg)
