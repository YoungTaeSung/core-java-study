package core.ch05.inheritance.object;

class AAA {
	
}
public class EmployeeHashTest {
	public static void main(String[] args) {
		Employee sam = new Employee("Sam", 2000);
		System.out.println(sam.hashCode());
		Employee bob = new Employee("Sam", 2000);
		System.out.println(bob.hashCode());
		
		AAA a1 = new AAA();
		AAA a2 = new AAA();
		System.out.println(a1.toString());
		System.out.println(a2.toString());
		System.out.println(Integer.toHexString(a1.hashCode()));
		System.out.println(Integer.toHexString(a2.hashCode()));
		
		System.exit(0);
	}
}
