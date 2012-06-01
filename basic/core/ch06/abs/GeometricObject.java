package core.ch06.abs;

public abstract class GeometricObject {
	private String color = "white";
	private boolean filled;

	/** Construct a default geometric object */
	protected GeometricObject() { }
	
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
	public abstract double getArea();
	public abstract double getPerimeter();
	
	public String toString() {
		return "Color: " + color +
		" and filled: " + filled;
	}
}


