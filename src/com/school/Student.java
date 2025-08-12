package com.school;

public class Student {
    private static int idCounter = 1;
    private int studentId;
    private String name;

    public Student(String name) {
        this.studentId = idCounter++;
        this.name = name;
    }

    // Getters (Encapsulation)
    public int getStudentId() {
        return studentId;
    }

    public String getName() {
        return name;
    }

    public void displayInfo() {
        System.out.println("Student ID: " + studentId + ", Name: " + name);
    }
}
