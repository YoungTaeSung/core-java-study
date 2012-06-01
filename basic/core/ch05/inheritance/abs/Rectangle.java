package core.ch05.inheritance.abs;

public class Rectangle extends ABSShape {
	private double width, height;
	
	public Rectangle(double _w, double _h) {
		width=_w; height=_h;
	}
	public double getWidth() {	return width; }
	public void setWidth(int width) { this.width = width; }
	public double getHeight() { return height; }
	public void setHeight(int height) {	this.height = height; }
	@Override
	public double getArea() {
		double ret = Double.parseDouble(String.format("%.3f", width*height));
		return ret;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		return (int)(prime * result + height+width);
	}
	@Override
	public boolean equals(Object obj) {
		if (!super.equals(obj)) return false;
		Rectangle other = (Rectangle) obj;
		if (height != other.height)
			return false;
		if (width != other.width)
			return false;
		return true;
	}
}