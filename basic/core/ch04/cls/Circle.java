package core.ch04.cls;

public class Circle {
	public double radius;
	
	public Circle() { radius = 0.0; }
	public Circle(double r) { radius = r; }
	
	public double getArea() {
		return radius*radius*Math.PI;
	}
}
