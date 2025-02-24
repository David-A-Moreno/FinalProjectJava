import java.util.ArrayList;
import java.util.List;

public class UniversitySystem {
	private List<Teacher> teachers;
    private List<Student> students;
    private List<UniversityClass> classes;
    
    public UniversitySystem() {
        teachers = new ArrayList<>();
        students = new ArrayList<>();
        classes = new ArrayList<>();
        initializeData();
    }
    
    // Inicializa los datos mínimos requeridos
    private void initializeData() {
        // Se crean 2 profesores full time y 2 part time
        FullTimeTeacher ft1 = new FullTimeTeacher("Profesol Jirafales",32, 1000, 5);
        FullTimeTeacher ft2 = new FullTimeTeacher("Tronchatoro",30, 1200, 7);
        PartTimeTeacher pt1 = new PartTimeTeacher("Senor electrico",44, 800, 20);
        PartTimeTeacher pt2 = new PartTimeTeacher("Charles Francis Xavier",38, 900, 15);
        
        teachers.add(ft1);
        teachers.add(ft2);
        teachers.add(pt1);
        teachers.add(pt2);
        
        // Se crean 6 estudiantes
        Student s1 = new Student("Juan", "S001", 21);
        Student s2 = new Student("Luisa", "S002", 22);
        Student s3 = new Student("Andres", "S003", 23);
        Student s4 = new Student("Camila", "S004", 18);
        Student s5 = new Student("Steven", "S005", 23);
        Student s6 = new Student("Alejandro", "S006", 20);
        
        students.add(s1);
        students.add(s2);
        students.add(s3);
        students.add(s4);
        students.add(s5);
        students.add(s6);
        
        // Se crean 4 clases
        UniversityClass c1 = new UniversityClass("Programming Fundamentals", "Room A", ft1);
        c1.addStudent(s1);
        c1.addStudent(s2);
        
        UniversityClass c2 = new UniversityClass("Algorith Design", "Room B", pt1);
        c2.addStudent(s3);
        c2.addStudent(s4);
        
        UniversityClass c3 = new UniversityClass("OOP With Java", "Room C", ft2);
        c3.addStudent(s5);
        c3.addStudent(s6);
        
        UniversityClass c4 = new UniversityClass("Selenium", "Room D", pt2);
        c4.addStudent(s1);
        c4.addStudent(s3);
        c4.addStudent(s5);
        
        classes.add(c1);
        classes.add(c2);
        classes.add(c3);
        classes.add(c4);
    }
    
    public void printAllTeachers() {
        for (Teacher t : teachers) {
            t.printInfo();
        }
    }
    
    public void printAllClasses() {
        for (int i = 0; i < classes.size(); i++) {
            System.out.println((i + 1) + ". " + classes.get(i).getClassName());
        }
    }
    
    public void printClassDetails(int index) {
        if (index >= 0 && index < classes.size()) {
            classes.get(index).printClassInfo();
        } else {
            System.out.println("Invalid class selection.");
        }
    }
    
    public void addStudentToClass(Student student, int classIndex) {
        if (classIndex >= 0 && classIndex < classes.size()) {
            classes.get(classIndex).addStudent(student);
            // También se agrega a la lista global de estudiantes
            students.add(student);
            System.out.println("Student added successfully.");
        } else {
            System.out.println("Invalid class selection.");
        }
    }
    
    public void createNewClass(UniversityClass newClass) {
        classes.add(newClass);
        System.out.println("Class created successfully.");
    }
    
    public void listClassesForStudent(String studentId) {
        boolean found = false;
        for (UniversityClass uc : classes) {
            for (Student s : uc.getStudents()) {
                if (s.getId().equals(studentId)) {
                    System.out.println("The Student " + studentId 
                            + " is enrolled in the class: " + uc.getClassName());
                    found = true;
                }
            }
        }
        if (!found) {
            System.out.println("No classes were found for the student with id: " + studentId);
        }
    }
    
    public List<Teacher> getTeachers() {
        return teachers;
    }
    
    public List<Student> getStudents() {
        return students;
    }
    
    public List<UniversityClass> getClasses() {
        return classes;
    }
}
