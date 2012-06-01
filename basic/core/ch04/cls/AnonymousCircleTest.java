package core.ch04.cls;

public class AnonymousCircleTest {
	public static void main(String[] args) {
		new AccessCircle(10.0);
		new AccessCircle(12.5).radius = 20.4;
		double area = new AccessCircle(29.6).getArea();
		
		System.out.println("Area = "+area);
		System.exit(0);
	}
}
