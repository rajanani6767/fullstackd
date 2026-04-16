package com.student.service;

import com.student.dto.Student;
import org.springframework.jms.core.JmsTemplate;
import org.springframework.stereotype.Service;

@Service
public class StudentProducer {

    private final JmsTemplate jmsTemplate;

    public StudentProducer(JmsTemplate jmsTemplate) {
        this.jmsTemplate = jmsTemplate;
    }

    public void sendStudent(Student student) {
        jmsTemplate.convertAndSend("student.queue", student);
        System.out.println("Sent: " + student.getName());
    }
}