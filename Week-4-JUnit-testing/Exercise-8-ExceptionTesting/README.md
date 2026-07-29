# Exercise 8 – Exception Testing

## Objective
Test that a method throws the expected exception using JUnit 5.

## Scenario
Verify that a method throws an `IllegalArgumentException`.

## Technologies Used
- Java 23
- Maven
- JUnit 5

## Files
- ExceptionThrower.java
- ExceptionThrowerTest.java

## Features
- Uses `assertThrows()`
- Validates expected exceptions
- Demonstrates exception testing

## Maven Commands

Compile:

```bash
mvn clean compile
```

Run Tests:

```bash
mvn clean test
```

## Expected Output

```
BUILD SUCCESS
```

## Learning Outcome
Understand how to verify exceptions using JUnit 5.