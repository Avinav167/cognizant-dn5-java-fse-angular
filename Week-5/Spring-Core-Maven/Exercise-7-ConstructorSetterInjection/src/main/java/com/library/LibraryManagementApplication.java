package com.library;

import com.library.service.BookService;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class LibraryManagementApplication {

    public static void main(String[] args) {

        ClassPathXmlApplicationContext context =
                new ClassPathXmlApplicationContext("applicationContext.xml");

        System.out.println("\n--- Constructor Injection ---");

        BookService constructorService =
                context.getBean(
                        "bookServiceConstructor",
                        BookService.class
                );

        constructorService.displayBooks();

        System.out.println("\n--- Setter Injection ---");

        BookService setterService =
                context.getBean(
                        "bookServiceSetter",
                        BookService.class
                );

        setterService.displayBooks();

        context.close();
    }
}