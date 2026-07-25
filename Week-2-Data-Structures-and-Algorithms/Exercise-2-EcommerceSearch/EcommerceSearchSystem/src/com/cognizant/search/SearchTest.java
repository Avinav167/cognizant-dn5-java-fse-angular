package com.cognizant.search;

import java.util.Arrays;
import java.util.Comparator;

public class SearchTest {

    public static void main(String[] args) {

        Product[] products = {

                new Product(101, "Laptop", "Electronics"),
                new Product(102, "Mouse", "Accessories"),
                new Product(103, "Keyboard", "Accessories"),
                new Product(104, "Monitor", "Electronics"),
                new Product(105, "Speaker", "Audio")
        };

        System.out.println("Linear Search:");

        Product result1 =
                SearchOperations.linearSearch(products, "Keyboard");

        System.out.println(result1);

        Arrays.sort(products,
                Comparator.comparing(Product::getProductName));

        System.out.println("\nBinary Search:");

        Product result2 =
                SearchOperations.binarySearch(products, "Keyboard");

        System.out.println(result2);
    }
}