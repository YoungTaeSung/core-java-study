package core.ch05.inheritance.problem;

public class GeometricObjectTest {
	public static void main(String[] args) {
		GeometricObject obj0 = new GeometricObject();
		GeometricObject obj1 = new Circle(12.4);
		GeometricObject obj2 = new Rectangle(20, 13.6);
		
		obj1.setColor("Red");
		obj2.setColor("Blue");
		
		System.exit(0);
	}
}