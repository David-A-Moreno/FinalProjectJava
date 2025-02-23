
public class Student extends Person {

	private String id;
    
    public Student(String name, String id, int age) {
        super(name, age);
        this.id = id;
    }
    
    public String getId() {
        return id;
    }
    
    public void setId(String id) {
        this.id = id;
    }
    
    @Override
    public void printInfo() {
        System.out.println("Student - Name: " + name + ", ID: " + id + ", Age: " + getAge());
    }

}
