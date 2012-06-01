package core.ch05.dbinding;

public class PersonTest {
	public static void main(String[] args) {
		Object [] objArray = new Person[3];
		objArray[0] = new Person("God");
		objArray[1] = new Employee("Sam", 3000.0);
		objArray[2] = new Student("Merry", "A+");
		
		((Employee)objArray[1]).addSalary(1000);
		System.out.println(objArray[1]);
		
		for(Object o : objArray) {
			System.out.println(o);
		}
		for(Object o : objArray) {
			if(o instanceof Employee)
				((Employee)o).addSalary(2000);
			if(o instanceof Student)
				((Student)o).modifyGrade("F");
		}
		for(Object o : objArray) {
			System.out.println(o);
		}
		System.exit(0);
	}
}
