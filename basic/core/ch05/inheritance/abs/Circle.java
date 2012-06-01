package core.ch05.inheritance.abs;

public class Circle extends ABSShape {
	private double radius;
	
	public Circle() { radius=0.0; }
	public Circle(double _radius) { radius=_radius; }
	
	public double getRadius() { return radius; }
	public void setRadius(double _radius) { radius=_radius; }
	
	@Override
	public double getArea() {
		double ret = Double.parseDouble(String.format("%.3f", Math.pow(radius, 2)*Math.PI));
		return ret;
	}
	@Override
	public String toString() {
		return "Circle [radius=" + radius + "]";
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		long temp;
		temp = Double.doubleToLongBits(radius);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if(!super.equals(obj)) { return false; }
		Circle other = (Circle) obj;
		if (Double.doubleToLongBits(radius) != Double
				.doubleToLongBits(other.radius))
			return false;
		return true;
	}
}
