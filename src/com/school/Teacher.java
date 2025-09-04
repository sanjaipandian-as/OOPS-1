package com.school;

public class Teacher extends Person {
    private String subject;
    private double salary;

    public Teacher(String name, int age, String gender, String subject, double salary) {
        super(name, age, gender);
        this.subject = subject;
        this.salary = salary;
    }

    @Override
    public String displayInfo() {
        return super.displayInfo() + ", Subject: " + subject + ", Salary: " + salary;
    }
}
