# School Management Project

This is a simple Java project to demonstrate object-oriented programming concepts like classes, objects, arrays, constructors, and static variables for auto-ID generation.

---

## 📚 Part 2 – Base Classes & Array Usage
In Part 2, we:
- Created `Student` and `Course` classes.
- Added `setDetails()` and `displayDetails()` methods.
- Used arrays of `Student` and `Course` objects in `Main.java`.
- Displayed student and course details.

---

## ⚙️ Part 3 – Constructor Initialization & Auto-ID Generation
In Part 3, we:
- Removed `setDetails()` methods from `Student` and `Course`.
- Added constructors to initialize fields directly.
- Implemented **automatic unique ID generation** using `static` counters:
  - Students start from ID `1` and increment automatically.
  - Courses start from ID `C101` and increment automatically.
- Updated `Main.java` to create objects using constructors.
- Created extra students and courses to verify the ID generation.

---

## 🛠 How to Compile & Run

From the project root:

```bash
# Compile all Java files
javac -d out src/com/school/*.java

# Run the Main class
java -cp out com.school.Main


# School Management Project

## Part-04: Data Encapsulation & Attendance Recording Validation

### Changes:
- Applied **Encapsulation** to `Student` and `Course` classes by making fields private and adding public getters.
- Created a new `AttendanceRecord` class with:
  - Private fields: `studentId`, `courseId`, `status`
  - Constructor with **status validation**: Only "Present" or "Absent" allowed (case-insensitive). Otherwise set to `"Invalid"` and print a warning.
  - Public getters and a `displayRecord()` method.
- Updated `Main.java` to:
  - Use `ArrayList<AttendanceRecord>` for attendance logs.
  - Record attendance for students and courses, including one with invalid status to test validation.

### How to Run:
```bash
javac src/com/school/*.java
java -cp src com.school.Main
