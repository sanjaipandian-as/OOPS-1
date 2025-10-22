package com.school;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void displaySchoolDirectory(List<Person> people) {
        System.out.println("\n=== School Directory ===");
        for (Person person : people) {
            person.displayDetails();
        }
    }

    public static void main(String[] args) {
        RegistrationService registrationService = new RegistrationService();
        AttendanceService attendanceService = new AttendanceService();

        Student s1 = new Student("Alice", 20, "Female");
        Student s2 = new Student("Bob", 22, "Male");
        Student s3 = new Student("Charlie", 21, "Male");

        Teacher t1 = new Teacher("Lakshmi", 40, "Female", "Mathematics", 60000);
        Staff st1 = new Staff("Ravi", 35, "Male", "Clerk", "Administration");

        List<Person> schoolPeople = new ArrayList<>();
        schoolPeople.add(s1);
        schoolPeople.add(s2);
        schoolPeople.add(s3);
        schoolPeople.add(t1);
        schoolPeople.add(st1);

        displaySchoolDirectory(schoolPeople);

        // Create courses with capacity and section size
        Course c1 = registrationService.createCourse("Mathematics", 4, 2); // 4 total, 2 per section
        Course c2 = registrationService.createCourse("Science", 3, 1); // 3 total, 1 per section

        registrationService.enrollStudentInCourse(s1, c1);
        registrationService.enrollStudentInCourse(s2, c1);
        registrationService.enrollStudentInCourse(s3, c1); // should create new section
        registrationService.enrollStudentInCourse(s1, c2);
        registrationService.enrollStudentInCourse(s2, c2); // should create new section

        // Display courses with sectioning
        c1.displayCourse();
        c2.displayCourse();
    }
}
