package core.ch05.inheritance.dbinding;

public class PersonTest {

	public static void main(String[] args) {
		Person[] pArray = new Person[4];
		pArray[0] = new Person();
		pArray[1] = new Student();
		pArray[2] = new Employee();
		pArray[3] = new CollegeStudent();
		
		for(Person p : pArray) {
			String msg = p.toString();
			System.out.println(msg);
		}
		
		System.exit(0);
	}
}
