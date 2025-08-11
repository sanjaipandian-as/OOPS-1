package com.school;

public class Main {
    public static void main(String[] args) {
        // Create Students using constructor
        Student[] students = {
            new Student("Alice"),
            new Student("Bob"),
            new Student("Charlie"),
            new Student("David") // extra student to check auto ID
        };

        // Create Courses using constructor
        Course[] courses = {
            new Course("Mathematics"),
            new Course("Physics"),
            new Course("Chemistry") // extra course to check auto ID
        };

        // Display Students
        System.out.println("=== Student Details ===");
        for (Student student : students) {
            student.displayDetails();
        }

        // Display Courses
        System.out.println("=== Course Details ===");
        for (Course course : courses) {
            course.displayDetails();
        }
    }
}
