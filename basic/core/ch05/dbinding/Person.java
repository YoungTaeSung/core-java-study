package core.ch05.dbinding;

public class Person {
	private String name;
	public Person(String initName) {
		name = initName;
	}
	public String toString() {
		return "Person's Name: "+name;
	}
}
class Employee extends Person {
	private double salary;
	public Employee(String name, double initSalary) {
		super(name);
		salary = initSalary;
	}
	//subclass specific method
	public void addSalary(double bonus) {
		salary += bonus;
	}
	public String toString() {
		return super.toString() + "Employee Salary: "+salary;
	}
}
class Student extends Person {
	private String grade;
	public Student(String name, String grade) {
		super(name);
		this.grade = grade;
	}
	//subclass specific method
	public void modifyGrade(String newGrade) {
		grade = newGrade;
	}
	public String toString() {
		return super.toString()+"Student Score: "+grade;
	}
}