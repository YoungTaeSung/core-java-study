package core.ch04.cls;

public class PersonSwapTest {
	public static void swapPerson(Person first, Person second) {
		Person tmp = first;
		first = second;
		second = first;
	}
	public static void main(String[] args) {
		Person sam = new Person(10, "Sam");
		Person bob = new Person(20, "Bob");
		
		System.out.println("Before Swap");
		System.out.println(sam);
		System.out.println(bob);
		
		swapPerson(sam, bob);
		
		System.out.println("After Swap");
		System.out.println(sam);
		System.out.println(bob);
		
		System.exit(0);
	}
}
