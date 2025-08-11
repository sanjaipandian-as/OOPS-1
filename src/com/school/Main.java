package com.school; // ✅ must be first line

public class Main {
    public static void main(String[] args) {
        // Create arrays for Students and Courses
        Student[] students = new Student[3];
        Course[] courses = new Course[2];

        // Initialize Students
        students[0] = new Student();
        students[0].setDetails(1, "Alice");

        students[1] = new Student();
        students[1].setDetails(2, "Bob");

        students[2] = new Student();
        students[2].setDetails(3, "Charlie");

        // Initialize Courses
        courses[0] = new Course();
        courses[0].setDetails("C101", "Mathematics");

        courses[1] = new Course();
        courses[1].setDetails("C102", "Physics");

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
