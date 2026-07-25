package com.cognizant.library;

import java.util.Arrays;
import java.util.Comparator;

public class LibraryTest {

    public static void main(String[] args) {

        Book[] books = {

                new Book(101, "Java Programming", "James Gosling"),
                new Book(102, "Data Structures", "Mark Allen"),
                new Book(103, "Operating Systems", "Silberschatz"),
                new Book(104, "Computer Networks", "Andrew Tanenbaum"),
                new Book(105, "Database Systems", "Raghu Ramakrishnan")
        };

        System.out.println("Linear Search:");

        Book result1 =
                LibrarySearch.linearSearch(books, "Operating Systems");

        if (result1 != null)
            System.out.println(result1);
        else
            System.out.println("Book not found.");

        Arrays.sort(books,
                Comparator.comparing(Book::getTitle));

        System.out.println("\nBinary Search:");

        Book result2 =
                LibrarySearch.binarySearch(books, "Operating Systems");

        if (result2 != null)
            System.out.println(result2);
        else
            System.out.println("Book not found.");
    }
}