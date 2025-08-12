package com.school;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        // Create students
        Student s1 = new Student("Alice");
        Student s2 = new Student("Bob");

        // Create courses
        Course c1 = new Course("Mathematics");
        Course c2 = new Course("Science");

        // Display student and course info
        s1.displayInfo();
        s2.displayInfo();
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
    }
}
