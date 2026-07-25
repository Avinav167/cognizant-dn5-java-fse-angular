package com.cognizant.employee;

public class EmployeeTest {

    public static void main(String[] args) {

        EmployeeManager manager = new EmployeeManager(10);

        manager.addEmployee(new Employee(101, "Abhinav", "Software Engineer", 65000));
        manager.addEmployee(new Employee(102, "Rahul", "QA Engineer", 55000));
        manager.addEmployee(new Employee(103, "Priya", "HR", 50000));

        manager.displayEmployees();

        System.out.println("\nSearching Employee:");

        Employee employee = manager.searchEmployee(102);

        if (employee != null)
            System.out.println(employee);
        else
            System.out.println("Employee not found.");

        manager.deleteEmployee(101);

        manager.displayEmployees();
    }
}