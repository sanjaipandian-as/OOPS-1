package com.school;

public class RegistrationService {
    public Course createCourse(String name, int capacity) {
        return new Course(name, capacity);
    }

    public boolean enrollStudentInCourse(Student student, Course course) {
        boolean success = course.addStudent(student);
        if (success) {
            System.out.println(student.getName() + " enrolled in " + course.getCourseName());
        } else {
            System.out.println("Enrollment failed: " + course.getCourseName() + " is full!");
        }
        return success;
    }
}
