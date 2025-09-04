package com.school;

public class Staff extends Person {
    private String role;
    private String department;

    public Staff(String name, int age, String gender, String role, String department) {
        super(name, age, gender);
        this.role = role;
        this.department = department;
    }

    @Override
    public String displayInfo() {
        return super.displayInfo() + ", Role: " + role + ", Department: " + department;
    }
}
