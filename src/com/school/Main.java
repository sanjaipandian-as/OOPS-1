package com.school;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        // Create students
        Student s1 = new Student("Alice", 20, "Female");
        Student s2 = new Student("Bob", 22, "Male");

        // Create courses
        Course c1 = new Course("Mathematics");
        Course c2 = new Course("Science");

        // Display student and course info
        System.out.println(s1.displayInfo());
        System.out.println(s2.displayInfo());
        c1.displayCourse();
        c2.displayCourse();

        // Create attendance log
        List<AttendanceRecord> attendanceLog = new ArrayList<>();

        attendanceLog.add(new AttendanceRecord(s1.getStudentId(), c1.getCourseId(), "Present"));
        attendanceLog.add(new AttendanceRecord(s2.getStudentId(), c2.getCourseId(), "Absent"));
        attendanceLog.add(new AttendanceRecord(s1.getStudentId(), c2.getCourseId(), "Late")); // Invalid

        // Display attendance records
        for (AttendanceRecord record : attendanceLog) {
            record.displayRecord();
        }

        // ===== Part-05 Hierarchy Demo =====
        Teacher t1 = new Teacher("Lakshmi", 40, "Female", "Mathematics", 60000);
        Staff st1 = new Staff("Ravi", 35, "Male", "Clerk", "Administration");

        System.out.println("\n=== Hierarchy Demo ===");
        System.out.println(s1.displayInfo());
        System.out.println(t1.displayInfo());
        System.out.println(st1.displayInfo());
    }
}
