package com.school;

import java.util.ArrayList;
import java.util.List;

public class Course {
    private static int idCounter = 1;
    private int courseId;
    private String courseName;
    private int capacity;      // total students allowed
    private int sectionSize;   // max students per section
    private List<List<Student>> sections; // list of sections

    public Course(String courseName, int capacity, int sectionSize) {
        this.courseId = idCounter++;
        this.courseName = courseName;
        this.capacity = capacity;
        this.sectionSize = sectionSize;
        this.sections = new ArrayList<>();
        sections.add(new ArrayList<>()); // start with first section
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

    public int getNumberOfEnrolledStudents() {
        return sections.stream().mapToInt(List::size).sum();
    }

    public boolean addStudent(Student student) {
        if (getNumberOfEnrolledStudents() >= capacity) {
            System.out.println("Cannot enroll " + student.getName() + " — course full.");
            return false;
        }

        // Assign student to a section with available space
        for (List<Student> section : sections) {
            if (section.size() < sectionSize) {
                section.add(student);
                System.out.println(student.getName() + " enrolled in " + courseName + ", Section " + (sections.indexOf(section)+1));
                return true;
            }
        }

        // If all sections full, create new section
        List<Student> newSection = new ArrayList<>();
        newSection.add(student);
        sections.add(newSection);
        System.out.println(student.getName() + " enrolled in " + courseName + ", Section " + sections.size());
        return true;
    }

    public void displayCourse() {
        System.out.println("\nCourse ID: " + courseId + ", Name: " + courseName +
                ", Total Capacity: " + capacity + ", Enrolled: " + getNumberOfEnrolledStudents());
        for (int i = 0; i < sections.size(); i++) {
            System.out.print("  Section " + (i+1) + ": ");
            for (Student s : sections.get(i)) {
                System.out.print(s.getName() + " ");
            }
            System.out.println();
        }
    }
}
