package com.example.demo.student;

import org.springframework.stereotype.Component;

import java.time.LocalDate;
import java.util.List;

@Component
public class StudentService {
    public List<Student> getStudents() {
        return List.of(
                new Student(1L, "Jasper", "jasperkrol@gmail.com", LocalDate.of(1990, 07, 28), 31)
        );
    }
}
