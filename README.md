# University Classes Tracking System

This repository contains a Java application that tracks university classes, teachers, and students. The system allows you to:
- Initialize sample data for teachers, students, and classes.
- Display a menu with the following options:
  - Print all professors with their data.
  - Print all classes and select one to view its details (including its teacher and students).
  - Create a new student and add them to an existing class.
  - Create a new class by assigning an existing teacher and adding existing students.
  - List all the classes in which a given student is enrolled (search by student ID).
  - Exit the program.

## Prerequisites
Before running the program, ensure you have the following installed:
- **Java 8**  
  [Download Java 8](https://www.oracle.com/java/technologies/javase/javase8-archive-downloads.html)
- **Git Bash**  
  [Download Git Bash](https://gitforwindows.org/)

## How to Run the Program

1. **Clone the Repository**  
   Open Git Bash and run:
   ```bash
   https://github.com/David-A-Moreno/FinalProjectJava.git

2. **Clone the Repository**  
   Open Git Bash and run:
   ```bash   
    cd FinalProjectJava

3. **Compile the Source Files** 
    
    Create a directory for compiled classes (if it doesn't already exist) and compile the source code using the following command:
    ```bash 
    mkdir -p bin
    javac -d bin src/main/*.java src/model/*.java

4. **Compile the Source Files**
    Execute the main class from the bin directory:
    ```bash 
    java -cp bin main.main

## Using the Application

Once the program starts, you will see a menu with various options. Enter the corresponding number to perform an operation. For example:

- Option 1: Print all teachers.
- Option 2: Print all classes and view details for a selected class.
- Option 3: Create a new student and add them to an existing class.
- Option 4: Create a new class with an existing teacher and selected students.
- Option 5: List classes in which a student (searched by ID) is enrolled.
- Option 6: Exit the application.

## Additional Notes

**Project Structure:**

The code is organized into packages for better maintainability:

- **model**: Contains the data model classes (Person, Student, Teacher, FullTimeTeacher, PartTimeTeacher, UniversityClass).

- **main**: Contains the application logic and the main class.

**Git Usage**:

The project uses proper Git practices including a .gitignore file, multiple branches, and regular commits.