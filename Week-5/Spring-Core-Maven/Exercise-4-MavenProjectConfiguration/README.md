# Exercise 4 - Creating and Configuring a Maven Project

## Objective

Create and configure a Maven project for the Library Management application with the required Spring Framework dependencies.

## Scenario

The Library Management application requires a Maven-based project configuration with Spring dependencies.

## Technologies Used

- Java 8
- Maven
- Spring Context
- Spring AOP
- Spring Web MVC

## Dependencies

The following Spring dependencies are configured in `pom.xml`:

- Spring Context
- Spring AOP
- Spring WebMVC

## Maven Compiler Configuration

The Maven Compiler Plugin is configured to use Java 1.8.

```xml
<configuration>
    <source>1.8</source>
    <target>1.8</target>
</configuration>