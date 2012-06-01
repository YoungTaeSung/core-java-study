package core.ch05.inheritance.object;

class Employee {
	private String name;
	private int salary;
	public Employee(String _name, int _salary) { 
		name = _name; 
		salary = _salary;
	}
	public boolean equals(Employee emp) {
		return name.equals(emp.name) && (salary == emp.salary);
	}
}
public class EqualsTest2 {
	public static void main(String[] args) {
		Employee p1 = new Employee("Sam", 1200);
		Employee p2 = new Employee("Sam", 1200);
		
		if(p1.equals(p2)) {
			System.out.println("equals() OK");
		} else {
			System.out.println("equals() NO");
		}
		System.exit(0);
	}
}
