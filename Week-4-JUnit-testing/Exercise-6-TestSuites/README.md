# Exercise 6 – Test Suites and Categories

## Objective
Demonstrate how to group multiple JUnit test classes into a single test suite using JUnit 5.

## Scenario
A test suite is used to execute multiple related test classes together. This helps organize and manage test execution efficiently.

## Technologies Used
- Java 23
- Maven
- JUnit 5
- JUnit Platform Suite

## Project Structure

```
Exercise-6-TestSuites
│
├── src
│   ├── main
│   │   └── java
│   │       └── com
│   │           └── cognizant
│   │               ├── Calculator.java
│   │               └── EvenChecker.java
│   │
│   └── test
│       └── java
│           └── com
│               └── cognizant
│                   ├── CalculatorTest.java
│                   ├── EvenCheckerTest.java
│                   └── AllTests.java
│
├── pom.xml
└── README.md
```

## Features
- Created multiple JUnit test classes.
- Grouped tests using JUnit Test Suite.
- Used `@Suite`.
- Used `@SelectClasses`.
- Executed multiple test classes in a single run.

## Maven Commands

Compile the project:

```bash
mvn clean compile
```

Run all tests:

```bash
mvn clean test
```

## Expected Output

```
BUILD SUCCESS
```

## Learning Outcome
- Understand Test Suites in JUnit 5.
- Execute multiple test classes together.
- Organize test execution efficiently using `@Suite` and `@SelectClasses`.