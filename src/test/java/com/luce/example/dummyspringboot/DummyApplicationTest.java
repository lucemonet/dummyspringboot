package com.luce.example.dummyspringboot;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class DummyApplicationTest {

    @Test
    void calculateRadiusTest() {
        DummySpringBootApplication dummySpringBootApplication = new DummySpringBootApplication();
        assertEquals(12.566370614359172, dummySpringBootApplication.calculateRadius(2.0));
    }
}