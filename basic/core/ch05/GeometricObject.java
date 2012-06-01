package core.ch05;

public class GeometricObject {
	private String color = "white";
	private boolean filled;
	private String name = "unknown";

	/** Construct a default geometric object */
	public GeometricObject() { }
	
	/** Return color */
	public String getColor() {
		return color;
	}
	/** Set a new color */
	public void setColor(String color) {
		this.color = color;
	}
	/** Return filled. Since filled is boolean,
	    so, the get method name is isFilled */
	public boolean isFilled() {
		return filled;
	}
	/** Set a new filled */
	public void setFilled(boolean filled) {
		this.filled = filled;
	}
	public double getArea() {
		return 0.0;
	}
	/** Return a string representation of this object */
	public String toString() {
		return "Color: " + color +
		" and filled: " + filled + "Name: "+name;
	}
}


