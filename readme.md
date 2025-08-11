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
