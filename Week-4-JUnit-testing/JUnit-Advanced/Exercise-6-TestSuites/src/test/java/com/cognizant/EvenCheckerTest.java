package com.cognizant;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class EvenCheckerTest {

    EvenChecker checker = new EvenChecker();

    @Test
    void testEvenNumber() {
        assertTrue(checker.isEven(8));
    }
}