package com.techpulse.controller;

import com.techpulse.model.Student;
import com.techpulse.service.StudentProducer;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/students")
@RequiredArgsConstructor
public class StudentController {

    private final StudentProducer producer;

    @PostMapping
    public String sendStudent(@RequestBody Student student) {
        producer.send(student);
        return "Student sent to Kafka";
    }
}
