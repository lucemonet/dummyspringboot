package com.luce.example.dummyspringboot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DummySpringBootApplication {

    public static void main(String[] args) {

        SpringApplication.run(DummySpringBootApplication.class, args);
    }

    public Double calculateRadius(Double radius) {
        return Math.PI * radius * radius;
    }
}
