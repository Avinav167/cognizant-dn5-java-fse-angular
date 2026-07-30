package com.cognizant;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class ParameterizedLoggingExample {

    private static final Logger logger =
            LoggerFactory.getLogger(ParameterizedLoggingExample.class);

    public static void main(String[] args) {

        String username = "Abhinav";
        int marks = 95;

        logger.info("Student {} scored {} marks.", username, marks);

        logger.warn("Student {} has only {} attempts left.", username, 2);

        logger.error("Unable to process record for user {}.", username);
    }
}