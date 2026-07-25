package com.cognizant.mvc;

public class MVCTest {

    public static void main(String[] args) {

        Student student = new Student();
        student.setName("Abhinav Kumar");
        student.setRollNo("2205XXXXXX");

        StudentView view = new StudentView();

        StudentController controller =
                new StudentController(student, view);

        controller.updateView();

        System.out.println();

        controller.setStudentName("Rahul Sharma");

        controller.updateView();
    }
}