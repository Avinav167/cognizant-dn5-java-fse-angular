package com.cognizant.task;

public class TaskTest {

    public static void main(String[] args) {

        TaskManager manager = new TaskManager();

        manager.addTask(101, "Complete Java Assignment", "Pending");
        manager.addTask(102, "Prepare Presentation", "In Progress");
        manager.addTask(103, "Submit Report", "Completed");

        manager.displayTasks();

        System.out.println("\nSearching Task:");

        manager.searchTask(102);

        System.out.println();

        manager.deleteTask(101);

        manager.displayTasks();
    }
}