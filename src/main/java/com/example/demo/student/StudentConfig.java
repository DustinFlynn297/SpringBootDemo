package com.example.demo.student;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

@Configuration
public class StudentConfig {

    @Bean
    CommandLineRunner commandLineRunner(StudentRespository respository) {
        return args -> {
            Student Miriam = new Student(
                    "Miriam",
                    "Miriam@gmail.com",
                    LocalDate.of(2000, Month.JANUARY, 5)


            );
            Student Steve = new Student(
                    "Steve",
                    "Steve@gmail.com",
                    LocalDate.of(2005, Month.APRIL, 8)


            );

            respository.saveAll(
                    List.of(Miriam, Steve)
            );
        };
    }
}
