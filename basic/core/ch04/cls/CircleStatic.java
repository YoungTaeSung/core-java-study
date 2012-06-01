package core.ch04.cls;

public class CircleStatic {
	public double radius;
	 
	/** The number of the objects created */
	public static int numberOfObjects = 0;
	
	/** Construct a circle with radius 1 */
	public CircleStatic() {
		radius = 1.0;
		numberOfObjects++;
	}
	/** Construct a circle with a specified radius */
	public CircleStatic(double newRadius) {
		radius = newRadius;
		numberOfObjects++;
	}
	/** Return numberOfObjects */
	public static int getNumberOfObjects() {
		return numberOfObjects;
	}
	/** Return the area of this circle */
	public double getArea() {
		return radius * radius * Math.PI;
	}
}


