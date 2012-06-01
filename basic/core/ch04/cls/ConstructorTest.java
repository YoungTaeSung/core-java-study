package core.ch04.cls;

public class ConstructorTest {
	public static void main(String[] args) {
		CircleConstructor circle1 = new CircleConstructor();
		CircleConstructor circle2 = new CircleConstructor(10.0);
		System.out.println(circle1.radius);
		System.out.println(circle2.radius);
		System.exit(0);
	}
}