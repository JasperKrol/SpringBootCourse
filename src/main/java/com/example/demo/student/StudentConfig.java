package com.example.demo.student;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.time.LocalDate;
import java.util.List;

@Configuration
public class StudentConfig {

    @Bean
    CommandLineRunner commandLineRunner(StudentRepository repository) {
        return args -> {
            Student jasper = new Student("Jasper", "jasperkrol@gmail.com", LocalDate.of(1990, 07, 28));

            Student willeke = new Student("Willeke", "willeke@gmail.com", LocalDate.of(1990, 04, 13));

            repository.saveAll(
                    List.of(jasper,willeke)
            );
        };
    }
}
