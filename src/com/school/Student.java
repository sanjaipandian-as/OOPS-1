package com.school;

public class Student extends Person {
    private static int idCounter = 1;
    private int studentId;

    public Student(String name, int age, String gender) {
        super(name, age, gender);
        this.studentId = idCounter++;
    }

    public int getStudentId() {
        return studentId;
    }

    @Override
    public String displayInfo() {
        return super.displayInfo() + ", Student ID: " + studentId;
    }
}
