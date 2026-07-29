package com.cognizant;

import org.junit.jupiter.api.Test;

import java.time.Duration;

import static org.junit.jupiter.api.Assertions.assertTimeout;

public class PerformanceTesterTest {

    private final PerformanceTester performanceTester = new PerformanceTester();

    @Test
    void testPerformTask() {

        assertTimeout(Duration.ofSeconds(1), () -> {
            performanceTester.performTask();
        });
    }
}