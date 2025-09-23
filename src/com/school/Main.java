package com.school;

import java.util.*;

public class Main {

    public static void displaySchoolDirectory(List<Person> people) {
        System.out.println("\n=== School Directory (Polymorphism Demo) ===");
        for (Person person : people) {
            person.displayDetails(); 
        }
    }

    public static void main(String[] args) {

        Student s1 = new Student("Alice", 20, "Female");
        Student s2 = new Student("Bob", 22, "Male");

        Course c1 = new Course("Mathematics");
        Course c2 = new Course("Science");

        Teacher t1 = new Teacher("Lakshmi", 40, "Female", "Mathematics", 60000);
        Staff st1 = new Staff("Ravi", 35, "Male", "Clerk", "Administration");

        List<Person> schoolPeople = new ArrayList<>();
        schoolPeople.add(s1);
        schoolPeople.add(s2);
        schoolPeople.add(t1);
        schoolPeople.add(st1);

        
        displaySchoolDirectory(schoolPeople);

    
        List<AttendanceRecord> attendanceLog = new ArrayList<>();
        attendanceLog.add(new AttendanceRecord(s1, c1, "Present"));
        attendanceLog.add(new AttendanceRecord(s2, c2, "Absent"));
        attendanceLog.add(new AttendanceRecord(s1, c2, "Late")); 

        
        System.out.println("\n=== Attendance Log ===");
        for (AttendanceRecord record : attendanceLog) {
            record.displayRecord();
        }

        
        List<Student> studentsToSave = new ArrayList<>();
        for (Person p : schoolPeople) {
            if (p instanceof Student) {
                studentsToSave.add((Student) p);
            }
        }

        // In real project: FileStorageService.saveData(studentsToSave, "students.txt");
        System.out.println("\nStudents prepared for saving: " + studentsToSave.size());
    }
}
