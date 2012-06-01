package core.ch04.cls;

public class RectangleV01 {
	private int xPos;
	private int yPos;
	private int width, height;
	
	public RectangleV01() {
		xPos = yPos = 0;
		width = height = 0;
	}
	public RectangleV01(int x, int y, int w, int h) {
		xPos = x; yPos = y; width = w; height = h;
	}
	public int getXPos() { return xPos;	}
	public int getYPos() { return yPos; }
	public int getWidth() { return width; }
	public int getHeight() { return height; }
	public int area() { return width * height; }
	
	public String toString() {
		return "Rectangle [(x: "+xPos+", y: "+yPos+")(w: "+width+", h: "+height+")]";
	}
}
