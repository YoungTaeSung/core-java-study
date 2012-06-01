package core.ch04.cls;

public class AccessCircle {
	public double radius;
	
	public AccessCircle() { radius = 0.0; }
	public AccessCircle(double r) { radius = r; }
	
	public double getArea() {
		return radius*radius*Math.PI;
	}
}
