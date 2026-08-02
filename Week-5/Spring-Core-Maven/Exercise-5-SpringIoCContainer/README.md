# Exercise 5 - Configuring the Spring IoC Container

## Objective

Configure the Spring IoC container for the Library Management application using XML-based bean configuration.

## Technologies Used

- Java
- Maven
- Spring Core
- Spring IoC
- XML Configuration

## Implementation

The application contains two main components:

- `BookRepository`
- `BookService`

Both classes are configured as Spring beans in `applicationContext.xml`.

The `BookRepository` dependency is injected into `BookService` using setter-based dependency injection.

## Spring Configuration

```xml
<bean id="bookRepository"
      class="com.library.repository.BookRepository"/>

<bean id="bookService"
      class="com.library.service.BookService">

    <property name="bookRepository"
              ref="bookRepository"/>

</bean>