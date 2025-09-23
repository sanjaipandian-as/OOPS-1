package com.school;

public class AttendanceRecord {
    private Student student;
    private Course course;
    private String status;

    public AttendanceRecord(Student student, Course course, String status) {
        this.student = student;
        this.course = course;

        if (status.equalsIgnoreCase("Present") || status.equalsIgnoreCase("Absent")) {
            this.status = status;
        } else {
            System.out.println("Warning: Invalid attendance status provided. Setting status to 'Invalid'.");
            this.status = "Invalid";
        }
    }

    public Student getStudent() {
        return student;
    }

    public Course getCourse() {
        return course;
    }

    public String getStatus() {
        return status;
    }

    public void displayRecord() {
        System.out.println(
            "Attendance Record -> " +
            "Student: " + student.getName() +
            " (ID: " + student.getStudentId() + ")" +
            " | Course: " + course.getCourseName() +
            " (ID: " + course.getCourseId() + ")" +
            " | Status: " + status
        );
    }

    public String toDataString() {
        
        return student.getStudentId() + "," + course.getCourseId() + "," + status;
    }
}
