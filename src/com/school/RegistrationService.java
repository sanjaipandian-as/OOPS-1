package com.school;

import java.util.ArrayList;
import java.util.List;

public class RegistrationService {
    private List<Course> courses = new ArrayList<>();

    public Course createCourse(String name, int capacity, int sectionSize) {
        Course course = new Course(name, capacity, sectionSize);
        courses.add(course);
        return course;
    }

    public boolean enrollStudentInCourse(Student student, Course course) {
        return course.addStudent(student);
    }

    public List<Course> getCourses() {
        return courses;
    }
}
