# Exercise 3 - Implementing Logging with Spring AOP

## Objective

Implement logging in a Spring application using Spring AOP and AspectJ.

## Technologies Used

- Java
- Maven
- Spring Core
- Spring AOP
- AspectJ
- XML Configuration

## Features

- Book repository layer
- Book service layer
- Setter-based dependency injection
- Spring AOP
- Before advice
- After advice
- AspectJ pointcut expressions

## AOP Configuration

The `LoggingAspect` intercepts methods from the service package.

The pointcut expression used is:

`execution(* com.library.service.*.*(..))`

The `@Before` advice executes before a service method.

The `@After` advice executes after a service method.

## Build

```bash
mvn clean compile