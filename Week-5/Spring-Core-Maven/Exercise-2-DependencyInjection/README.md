# Exercise 2 - Implementing Dependency Injection

## Objective

Implement dependency injection in a Spring application using XML-based configuration.

## Technologies Used

- Java
- Spring Core
- Maven
- XML

## Project Structure

Exercise-2-DependencyInjection/
├── pom.xml
├── README.md
└── src/
    └── main/
        ├── java/
        │   └── com/
        │       └── library/
        │           ├── LibraryManagementApplication.java
        │           ├── repository/
        │           │   └── BookRepository.java
        │           └── service/
        │               └── BookService.java
        └── resources/
            └── applicationContext.xml

## Implementation

The application contains a `BookRepository` and a `BookService`.

`BookRepository` is injected into `BookService` using setter-based dependency injection.

The dependency is configured in `applicationContext.xml`:

```xml
<bean id="bookRepository"
      class="com.library.repository.BookRepository"/>

<bean id="bookService"
      class="com.library.service.BookService">
    <property name="bookRepository"
              ref="bookRepository"/>
</bean>