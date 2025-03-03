package model;
import java.util.ArrayList;
import java.util.List;

public class UniversityClass {
	
	private static int classCount = 0;
    private String className;
    private String classroom;
    private Teacher teacher;
    private List<Student> students;
    
    public UniversityClass(String className, String classroom, Teacher teacher) {
        this.className = className;
        this.classroom = classroom;
        this.teacher = teacher;
        this.students = new ArrayList<>();
        classCount++;
    }
    
    public String getClassName() {
        return className;
    }
    
    public void setClassName(String className) {
        this.className = className;
    }
    
    public String getClassroom() {
        return classroom;
    }
    
    public void setClassroom(String classroom) {
        this.classroom = classroom;
    }
    
    public Teacher getTeacher() {
        return teacher;
    }
    
    public void setTeacher(Teacher teacher) {
        this.teacher = teacher;
    }
    
    public List<Student> getStudents() {
        return students;
    }
    
    public void addStudent(Student student) {
        this.students.add(student);
    }
    
    public void printClassInfo() {
        System.out.println("Class: " + className + ", Classroom: " + classroom);
        System.out.println("Teacher:");
        teacher.printInfo();
        System.out.println("Students:");
        for (Student s : students) {
            s.printInfo();
        }
    }
    
    public static int getClassCount() {
        return classCount;
    }
}
