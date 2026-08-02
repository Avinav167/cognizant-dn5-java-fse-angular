# Exercise 8 - Implementing Basic AOP with Spring

## Objective

Implement basic Aspect-Oriented Programming (AOP) in the Library Management application using Spring.

## Technologies Used

- Java
- Maven
- Spring Core
- Spring AOP
- AspectJ

## Implementation

A `LoggingAspect` class is used to separate logging from the business logic.

The aspect contains:

- Before advice
- After advice

## Before Advice

The `@Before` annotation executes the logging method before a service method is called.

```java
@Before("execution(* com.library.service.*.*(..))")
```

## After Advice

The `@After` annotation executes the logging method after a service method is called.

```java
@After("execution(* com.library.service.*.*(..))")
```

## AspectJ Configuration

AspectJ auto-proxying is enabled in `applicationContext.xml`:

```xml
<aop:aspectj-autoproxy/>
```

## Build

```bash
mvn clean compile
```

## Run

```bash
mvn exec:java -Dexec.mainClass="com.library.LibraryManagementApplication"
```

## Expected Output

```text
LOG: Before executing method - displayBooks
Displaying books from BookService...
Fetching books from BookRepository...
LOG: After executing method - displayBooks
```

## Result

Successfully implemented basic Spring AOP with before and after logging advice.