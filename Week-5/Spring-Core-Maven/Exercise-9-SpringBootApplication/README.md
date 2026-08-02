# Exercise 9 - Creating a Spring Boot Application

## Objective

Create a Spring Boot based Library Management application with RESTful CRUD operations.

## Technologies Used

- Java
- Maven
- Spring Boot
- Spring Web
- Spring Data JPA
- H2 Database

## Project Components

### Book Entity

The `Book` entity contains:

- id
- title
- author

### BookRepository

`BookRepository` extends `JpaRepository` to provide database CRUD operations.

### BookController

The REST controller provides endpoints for managing books.

## REST API

| Method | Endpoint | Description |
|---|---|---|
| GET | `/books` | Get all books |
| GET | `/books/{id}` | Get book by ID |
| POST | `/books` | Create a book |
| PUT | `/books/{id}` | Update a book |
| DELETE | `/books/{id}` | Delete a book |

## Build

```bash
mvn clean package
```

## Run

```bash
mvn spring-boot:run
```

## Sample POST Request

Endpoint:

`POST /books`

Request Body:

```json
{
  "title": "Spring in Action",
  "author": "Craig Walls"
}
```

## H2 Console

The H2 database console is available at:

`/h2-console`

JDBC URL:

`jdbc:h2:mem:librarydb`

Username:

`sa`

Password:

Leave blank.

## Result

Successfully created a Spring Boot Library Management application with CRUD operations using Spring Web, Spring Data JPA, and H2.