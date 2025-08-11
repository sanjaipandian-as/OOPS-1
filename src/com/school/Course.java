package com.school;

public class Course {
    String courseId;
    String courseName;

    // Method to set details
    public void setDetails(String courseId, String courseName) {
        this.courseId = courseId;
        this.courseName = courseName;
    }

    // Method to display details
    public void displayDetails() {
        System.out.println("Course ID: " + courseId);
        System.out.println("Course Name: " + courseName);
        System.out.println("------------------");
    }
}
