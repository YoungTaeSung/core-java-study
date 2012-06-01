package core.ch05.inheritance.abs;

import java.text.NumberFormat;
import java.text.SimpleDateFormat;

public class ABSShapeTest {
	public static void main(String[] args) {
		ABSShape circle = new Circle(12.5);
		System.out.println(circle.getArea());
		ABSShape rectangle = new Rectangle(12.5, 21.3);
		System.out.println(rectangle.getArea());
		System.exit(0);
	}
}
