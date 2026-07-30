# Spring Testing Exercise 8 - Test Controller Exception Handling

## Objective

Test a global exception handler using @ControllerAdvice.

## Technologies

- Spring Boot
- MockMvc
- JUnit 5
- Mockito

## Classes

- Exercise8Application
- User
- UserService
- UserController
- GlobalExceptionHandler
- UserControllerTest

## Result

Successfully verified that the controller returns HTTP 404 with the message "User not found" when a NoSuchElementException is thrown.