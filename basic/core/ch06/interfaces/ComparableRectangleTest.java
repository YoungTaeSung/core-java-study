package core.ch06.interfaces;

public class ComparableRectangleTest {
	public static void main(String[] args) {
		ComparableRectangle cRect1 = new ComparableRectangle(10, 20);
		ComparableRectangle cRect2 = new ComparableRectangle(5, 5);
		ComparableRectangle resultRect = (ComparableRectangle)(MaxOne.comparableMax(cRect1, cRect2));
		System.out.println(resultRect);
		System.exit(0);
	}
}
