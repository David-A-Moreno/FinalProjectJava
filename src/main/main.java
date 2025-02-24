package main;
import java.util.Scanner;

import model.Student;
import model.Teacher;
import model.UniversityClass;

public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		UniversitySystem system = new UniversitySystem();
        Scanner scanner = new Scanner(System.in);
        int option = 0;
        
        do {
            System.out.println("\n--- Menu ---");
            System.out.println("1. Print all teachers with their data");
            System.out.println("2. Print all classes and select one to view its data");
            System.out.println("3. Create a new student and add them to an existing class");
            System.out.println("4. Create a new class and add an existing teacher and students");
            System.out.println("5. List all classes a student is enrolled in (search by id)");
            System.out.println("6. Exit");
            System.out.print("Choose an option: ");
            
            try {
                option = Integer.parseInt(scanner.nextLine());
            } catch (NumberFormatException e) {
                System.out.println("Please enter a valid number.");
                continue;
            }
            
            switch (option) {
                case 1:
                    system.printAllTeachers();
                    break;
                case 2:
                    system.printAllClasses();
                    System.out.print("Select the class number: ");
                    int classIndex = Integer.parseInt(scanner.nextLine()) - 1;
                    system.printClassDetails(classIndex);
                    break;
                case 3:
                    System.out.print("Enter the student's name: ");
                    String name = scanner.nextLine();
                    System.out.print("Enter the student id: ");
                    String id = scanner.nextLine();
                    System.out.print("Enter the age of the student: ");
                    int age = Integer.parseInt(scanner.nextLine());
                    Student newStudent = new Student(name, id, age);
                    system.printAllClasses();
                    System.out.print("Select the class number to add the student to: ");
                    int classNum = Integer.parseInt(scanner.nextLine()) - 1;
                    system.addStudentToClass(newStudent, classNum);
                    break;
                case 4:
                    System.out.print("Enter the name of the class: ");
                    String className = scanner.nextLine();
                    System.out.print("Enter the classroom: ");
                    String classroom = scanner.nextLine();
                    
                    // Listar profesores para seleccionar uno
                    for (int i = 0; i < system.getTeachers().size(); i++) {
                        System.out.print((i + 1) + ". ");
                        system.getTeachers().get(i).printInfo();
                    }
                    System.out.print("Select the teacher's number: ");
                    int teacherIndex = Integer.parseInt(scanner.nextLine()) - 1;
                    Teacher selectedTeacher = system.getTeachers().get(teacherIndex);
                    
                    UniversityClass newClass = new UniversityClass(className, classroom, selectedTeacher);
                    
                    // Seleccionar estudiantes para la nueva clase
                    System.out.println("Select students to add (enter numbers separated by commas):");
                    for (int i = 0; i < system.getStudents().size(); i++) {
                        System.out.println((i + 1) + ". " + system.getStudents().get(i).getName());
                    }
                    String[] studentIndices = scanner.nextLine().split(",");
                    for (String indexStr : studentIndices) {
                        int idx = Integer.parseInt(indexStr.trim()) - 1;
                        newClass.addStudent(system.getStudents().get(idx));
                    }
                    system.createNewClass(newClass);
                    break;
                case 5:
                    System.out.print("Enter the student id: ");
                    String searchId = scanner.nextLine();
                    system.listClassesForStudent(searchId);
                    break;
                case 6:
                    System.out.println("Leaving...");
                    break;
                default:
                    System.out.println("Invalid option, please try again.");
            }
        } while (option != 6);
        
        scanner.close();
	}

}
