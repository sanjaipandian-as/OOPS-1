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

        Teacher t1 = new Teacher("Lakshmi", 40, "Female", "Mathematics", 60000);
        Staff st1 = new Staff("Ravi", 35, "Male", "Clerk", "Administration");

        List<Person> schoolPeople = new ArrayList<>();
        schoolPeople.add(s1);
        schoolPeople.add(s2);
        schoolPeople.add(t1);
        schoolPeople.add(st1);

        displaySchoolDirectory(schoolPeople);

        Course c1 = registrationService.createCourse("Mathematics", 2);
        Course c2 = registrationService.createCourse("Science", 1);

        registrationService.enrollStudentInCourse(s1, c1);
        registrationService.enrollStudentInCourse(s2, c1);
        registrationService.enrollStudentInCourse(s2, c2);
        registrationService.enrollStudentInCourse(s1, c2);

        List<AttendanceRecord> attendanceLog = new ArrayList<>();
        attendanceService.markAttendance(s1, c1, "Present");
        attendanceService.markAttendance(s2, c1, "Absent");
        attendanceService.markAttendance(s1, c2, "Late");
        attendanceService.markAttendance(s2, c2, "Present");

        System.out.println("\n=== Attendance Log ===");
        for (AttendanceRecord record : attendanceLog) {
            record.displayRecord();
        }

        c1.displayCourse();
        c2.displayCourse();
    }
}
