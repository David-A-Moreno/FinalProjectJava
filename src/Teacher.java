
public abstract class Teacher extends Person {

	protected double baseSalary;
    
    public Teacher(String name, int age, double baseSalary) {
        super(name, age);
        this.baseSalary = baseSalary;
    }
    
    public double getBaseSalary() {
        return baseSalary;
    }
    
    public void setBaseSalary(double baseSalary) {
        this.baseSalary = baseSalary;
    }
    
    // Método abstracto para calcular el salario, que se implementará en las subclases
    public abstract double calculateSalary();
    
    @Override
    public void printInfo() {
        System.out.println("Teacher - Name: " + name + ", Base Salary: " + baseSalary + ", Salary: " + calculateSalary());
    }

}
