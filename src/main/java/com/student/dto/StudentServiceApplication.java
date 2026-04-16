package com.student.dto;

import com.example.studentcrud.model.Student;
import com.student.service.StudentProducer;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class StudentServiceApplication implements CommandLineRunner {

    private final StudentProducer producer;

    public StudentServiceApplication(StudentProducer producer) {
        this.producer = producer;
    }

    public static void main(String[] args) {
        SpringApplication.run(StudentServiceApplication.class, args);
    }

    @Override
    public void run(String... args) {
        producer.sendStudent(new Student(1L, "Rahul", "CSE"));
    }
}