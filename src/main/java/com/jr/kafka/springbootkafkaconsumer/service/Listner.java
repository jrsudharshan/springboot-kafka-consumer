package com.jr.kafka.springbootkafkaconsumer.service;

import com.jr.kafka.springbootkafkaconsumer.model.Message;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
public class Listner {

    @Value("${kafka.topic.name}")
    private String topicName;

    @Value(value = "${kafka.consumer.groupId}")
    private String groupId;

    @KafkaListener(topics = "bday-notification-events", groupId = "bday_group_id")
    public void consume(String message) {
        System.out.println("Message: " + message);
    }

    @KafkaListener(topics = "bday-notification-events", groupId = "bday_group_id_json", containerFactory = "messageKafkaListenerFactory")
    public void consumeJson(Message message) {
        System.out.println("JSON Message: " + message);
    }
}
