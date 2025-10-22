package com.school;

import java.util.ArrayList;
import java.util.List;

public class Course {
    private static int idCounter = 1;
    private int courseId;
    private String courseName;
    private int capacity;
    private List<Student> enrolledStudents;

    public Course(String courseName, int capacity) {
        this.courseId = idCounter++;
        this.courseName = courseName;
        this.capacity = capacity;
        this.enrolledStudents = new ArrayList<>();
    }

    public int getCourseId() {
        return courseId;
    }

    public String getCourseName() {
        return courseName;
    }

    public int getCapacity() {
        return capacity;
    }

    public List<Student> getEnrolledStudents() {
        return enrolledStudents;
    }

    public int getNumberOfEnrolledStudents() {
        return enrolledStudents.size();
    }

    public boolean addStudent(Student student) {
        if (enrolledStudents.size() < capacity) {
            enrolledStudents.add(student);
            return true;
        }
        return false;
    }

    public void displayCourse() {
        System.out.println("Course ID: " + courseId + ", Course Name: " + courseName +
                ", Capacity: " + capacity + ", Enrolled: " + getNumberOfEnrolledStudents());
    }
}
