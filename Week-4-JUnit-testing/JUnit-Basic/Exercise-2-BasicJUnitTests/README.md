# Exercise 2 - Writing Basic JUnit Tests

## Objective
Write basic JUnit test cases for a simple Java Calculator class.

## Scenario
Create a Java class with methods and write JUnit test cases to verify their correctness.

## Project Structure

```
Exercise-2-BasicJUnitTests
│── pom.xml
│── README.md
└── src
    ├── main
    │   └── java
    │       └── com
    │           └── cognizant
    │               └── Calculator.java
    └── test
        └── java
            └── com
                └── cognizant
                    └── CalculatorTest.java
```

## Methods Tested

- Addition
- Subtraction
- Multiplication
- Division

## Technologies Used

- Java 23
- Maven
- JUnit 4.13.2
- VS Code

## How to Run

Compile the project:

```bash
mvn clean compile
```

Run the JUnit tests:

```bash
mvn test
```

## Expected Result

```
Tests run: 4
Failures: 0
Errors: 0
Skipped: 0

BUILD SUCCESS
```

## Author

**Abhinav Kumar**