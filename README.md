# springboot-kafka-consumer<br />

- Start Zookeeper<br />
bin/zookeeper-server-start.sh config/zookeeper.properties<br /><br />
- Start Kafka Server<br /><br />
bin/kafka-server-start.sh config/server.properties<br /><br />
- Create Kafka Topic<br />
bin/kafka-topics.sh --create --zookeeper localhost:2181 --replication-factor 1 --partitions 1 --topic bday-notification-events<br /><br />
- Publish:<br />
bin/kafka-console-producer.sh --broker-list localhost:9092 --topic Kbday-notification-events<br />
