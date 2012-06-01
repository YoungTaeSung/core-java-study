package core.ch05.inheritance.object;

class Person {
	private String name;
	public Person(String _name) { name = _name; }
}
public class EqualsTest1 {
	public static void main(String[] args) {
		Person p1 = new Person("Sam");
		Person p2 = new Person("Sam");
		
		if(p1.equals(p2)) {
			System.out.println("equals() OK");
		} else {
			System.out.println("equals() NO");
		}
		System.exit(0);
	}
}
