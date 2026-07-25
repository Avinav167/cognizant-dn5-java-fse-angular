package com.cognizant.task;

public class TaskManager {

    private Task head;

    // Add Task
    public void addTask(int id, String name, String status) {

        Task newTask = new Task(id, name, status);

        if (head == null) {
            head = newTask;
        } else {

            Task temp = head;

            while (temp.next != null) {
                temp = temp.next;
            }

            temp.next = newTask;
        }

        System.out.println("Task added successfully.");
    }

    // Search Task
    public void searchTask(int id) {

        Task temp = head;

        while (temp != null) {

            if (temp.taskId == id) {
                System.out.println(temp);
                return;
            }

            temp = temp.next;
        }

        System.out.println("Task not found.");
    }

    // Traverse Tasks
    public void displayTasks() {

        Task temp = head;

        System.out.println("\nTask List:");

        while (temp != null) {

            System.out.println(temp);

            temp = temp.next;
        }
    }

    // Delete Task
    public void deleteTask(int id) {

        if (head == null) {
            System.out.println("Task list is empty.");
            return;
        }

        if (head.taskId == id) {
            head = head.next;
            System.out.println("Task deleted successfully.");
            return;
        }

        Task temp = head;

        while (temp.next != null && temp.next.taskId != id) {
            temp = temp.next;
        }

        if (temp.next == null) {
            System.out.println("Task not found.");
        } else {
            temp.next = temp.next.next;
            System.out.println("Task deleted successfully.");
        }
    }
}