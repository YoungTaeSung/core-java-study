package core.ch04.cls;

public class PersonPassingTest {
	public static void trippleAge(Person p) {
		p.setAge(p.getAge()*3);
	}
	public static void main(String[] args) {
		Person sam = new Person(20);
		System.out.println("Age: "+sam.getAge());
		trippleAge(sam);
		System.out.println("Age: "+sam.getAge());
		System.exit(0);
	}
}
