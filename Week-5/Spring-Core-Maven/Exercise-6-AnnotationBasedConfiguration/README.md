# Exercise 6 - Configuring Beans with Annotations

## Objective

Configure Spring beans using annotations and component scanning instead of manually defining beans in XML.

## Technologies Used

- Java
- Maven
- Spring Core
- Spring IoC
- Annotation-Based Configuration
- XML Component Scanning

## Annotations Used

### @Service

Used to register `BookService` as a Spring service bean.

### @Repository

Used to register `BookRepository` as a Spring repository bean.

### @Autowired

Used to inject `BookRepository` into `BookService`.

## Component Scanning

Spring component scanning is enabled in `applicationContext.xml`:

```xml
<context:component-scan base-package="com.library"/>
```

Spring automatically discovers classes annotated with `@Service` and `@Repository`.

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
BookService is accessing BookRepository...
Fetching books from BookRepository...
```

## Result

Successfully configured Spring beans using annotations and component scanning.