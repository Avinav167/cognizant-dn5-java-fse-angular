# Exercise 7 – Test Execution Order

## Objective
Demonstrate how to control the execution order of JUnit 5 test methods.

## Scenario
Use JUnit annotations to execute test methods in a specified order.

## Technologies Used
- Java 23
- Maven
- JUnit 5

## Files
- OrderedTests.java

## Features
- Uses `@TestMethodOrder`
- Uses `MethodOrderer.OrderAnnotation`
- Uses `@Order`
- Executes tests in a predefined sequence

## Maven Command

Run the tests:

```bash
mvn clean test