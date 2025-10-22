package com.school;

import java.util.HashMap;
import java.util.Map;

public class AttendanceService {
    private Map<Course, Map<Student, String>> attendanceRecords = new HashMap<>();

    public void markAttendance(Student student, Course course, String status) {
        attendanceRecords.putIfAbsent(course, new HashMap<>());
        if (status.equalsIgnoreCase("Present") || status.equalsIgnoreCase("Absent")) {
            attendanceRecords.get(course).put(student, status);
            System.out.println("Marked " + student.getName() + " as " + status + " for " + course.getCourseName());
        } else {
            attendanceRecords.get(course).put(student, "Invalid");
            System.out.println("Invalid attendance for " + student.getName() + " in " + course.getCourseName());
        }
    }

    public String getAttendance(Student student, Course course) {
        return attendanceRecords.getOrDefault(course, new HashMap<>()).get(student);
    }
}
