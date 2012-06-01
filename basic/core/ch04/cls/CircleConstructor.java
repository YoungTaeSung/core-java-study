package core.ch04.cls;

public class CircleConstructor {
	public double radius;
	
	public CircleConstructor() { radius = 0.0; }
	public CircleConstructor(double r) { radius = r; }
	
	public double getArea() {
		return radius * radius * Math.PI;
	}
}
