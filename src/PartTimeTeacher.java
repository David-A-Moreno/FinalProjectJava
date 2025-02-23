
public class PartTimeTeacher extends Teacher {

	private int activeHoursPerWeek;
	
	public PartTimeTeacher(String name, int age, double baseSalary, int activeHoursPerWeek) {
		super(name, age, baseSalary);
		this.activeHoursPerWeek = activeHoursPerWeek;
	}
	
	public int getActiveHoursPerWeek() {
        return activeHoursPerWeek;
    }
    
    public void setActiveHoursPerWeek(int activeHoursPerWeek) {
        this.activeHoursPerWeek = activeHoursPerWeek;
    }
    
    // Salario = baseSalary * activeHoursPerWeek
    @Override
    public double calculateSalary() {
        return baseSalary * activeHoursPerWeek;
    }
    
    @Override
    public void printInfo() {
        System.out.println("Part Time Teacher - Name: " + name 
                + ", Active Hours/Week: " + activeHoursPerWeek + ", Salary: " + calculateSalary());
    }

}
