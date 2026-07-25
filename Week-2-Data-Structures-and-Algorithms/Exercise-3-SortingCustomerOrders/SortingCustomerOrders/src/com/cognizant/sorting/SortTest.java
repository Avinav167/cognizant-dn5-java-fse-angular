package com.cognizant.sorting;

public class SortTest {

    public static void main(String[] args) {

        Order[] bubbleOrders = {
                new Order(101, "Rahul", 1500),
                new Order(102, "Amit", 500),
                new Order(103, "Sneha", 3500),
                new Order(104, "Priya", 2500)
        };

        System.out.println("Bubble Sort:");

        SortOperations.bubbleSort(bubbleOrders);

        for (Order order : bubbleOrders) {
            System.out.println(order);
        }

        System.out.println("\nQuick Sort:");

        Order[] quickOrders = {
                new Order(101, "Rahul", 1500),
                new Order(102, "Amit", 500),
                new Order(103, "Sneha", 3500),
                new Order(104, "Priya", 2500)
        };

        SortOperations.quickSort(quickOrders, 0, quickOrders.length - 1);

        for (Order order : quickOrders) {
            System.out.println(order);
        }
    }
}