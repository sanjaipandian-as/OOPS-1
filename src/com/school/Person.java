package com.school;

public class Person {
    protected String name;
    protected int age;
    protected String gender;

    public Person(String name, int age, String gender) {
        this.name = name;
        this.age = age;
        this.gender = gender;
    }

    public String displayInfo() {
        return "Name: " + name + ", Age: " + age + ", Gender: " + gender;
    }
}
