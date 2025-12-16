package com.techpulse.service;

import com.techpulse.model.Student;
import lombok.RequiredArgsConstructor;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class StudentProducer {

    private final KafkaTemplate<String, Student> kafkaTemplate;

    public void send(Student student) {
        kafkaTemplate.send("student-topic", student);
        System.out.println("Sent to Kafka: " + student);
    }
}
