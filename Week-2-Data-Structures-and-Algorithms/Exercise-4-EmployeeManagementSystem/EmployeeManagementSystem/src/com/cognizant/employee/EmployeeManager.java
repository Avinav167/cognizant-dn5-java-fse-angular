package com.cognizant.employee;

public class EmployeeManager {

    private Employee[] employees;
    private int size;

    public EmployeeManager(int capacity) {
        employees = new Employee[capacity];
        size = 0;
    }

    // Add Employee
    public void addEmployee(Employee employee) {

        if (size < employees.length) {
            employees[size++] = employee;
            System.out.println("Employee added successfully.");
        } else {
            System.out.println("Array is full.");
        }
    }

    // Search Employee
    public Employee searchEmployee(int id) {

        for (int i = 0; i < size; i++) {

            if (employees[i].getEmployeeId() == id) {
                return employees[i];
            }
        }

        return null;
    }

    // Traverse Employees
    public void displayEmployees() {

        System.out.println("\nEmployee Records:");

        for (int i = 0; i < size; i++) {
            System.out.println(employees[i]);
        }
    }

    // Delete Employee
    public void deleteEmployee(int id) {

        for (int i = 0; i < size; i++) {

            if (employees[i].getEmployeeId() == id) {

                for (int j = i; j < size - 1; j++) {
                    employees[j] = employees[j + 1];
                }

                employees[size - 1] = null;
                size--;

                System.out.println("Employee deleted successfully.");
                return;
            }
        }

        System.out.println("Employee not found.");
    }
}