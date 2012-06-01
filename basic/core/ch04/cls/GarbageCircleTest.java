package core.ch04.cls;

public class GarbageCircleTest {
	public static void main(String[] args) {
		Circle c1 = new Circle(12.5);
		Circle c2 = new Circle(1.4);
		
		System.out.println("Before Ref Assignment");
		System.out.println("C1's R="+c1.radius);
		System.out.println("C2's R="+c2.radius);
		
		c1 = c2;
		
		System.out.println("After Ref Assignment");
		System.out.println("C1's R="+c1.radius);
		System.out.println("C2's R="+c2.radius);
		
		System.exit(0);
	}
}
