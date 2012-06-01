package core.ch04.cls;

public class CircleEncapTest {
	public static void main(String[] args) {
	// Create a Circle with radius 5.0
	CircleEncap myCircle = new CircleEncap(5.0);
	System.out.println("The area of the circle of radius "
						+ myCircle.getRadius() + " is " + myCircle.getArea());
	// Increase myCircle's radius by 10%
	myCircle.setRadius(myCircle.getRadius() * 1.1);
	System.out.println("The area of the circle of radius "
						+ myCircle.getRadius() + " is " + myCircle.getArea());
	}
}



