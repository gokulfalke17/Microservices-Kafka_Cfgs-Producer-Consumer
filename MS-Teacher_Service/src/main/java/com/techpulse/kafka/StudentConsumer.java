package com.techpulse.kafka;

import com.techpulse.model.Student;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

@Component
public class StudentConsumer {

    @KafkaListener(topics = "student-topic", groupId = "teacher-group")
    public void consume(Student student) {
        System.out.println("====== Student Consumed ======");
        System.out.println(student);
        System.out.println("==============================");
    }
}
