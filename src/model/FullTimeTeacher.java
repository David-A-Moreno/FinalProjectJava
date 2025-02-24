package model;

public class FullTimeTeacher extends Teacher {

	private int experienceYears;
    
    public FullTimeTeacher(String name, int age,  double baseSalary, int experienceYears) {
        super(name, age, baseSalary);
        this.experienceYears = experienceYears;
    }
    
    public int getExperienceYears() {
        return experienceYears;
    }
    
    public void setExperienceYears(int experienceYears) {
        this.experienceYears = experienceYears;
    }
    
    // Salario = baseSalary * (experienceYears * 1.1)
    @Override
    public double calculateSalary() {
        return baseSalary * (experienceYears * 1.1);
    }
    
    // Sobrescribimos el método printInfo definido en Person (no se usa toString)
    @Override
    public void printInfo() {
        System.out.println("Full Time Teacher - Name: " + name 
                + ", Experience: " + experienceYears + " years, Salary: " + calculateSalary());
    }
	
}
