package core.ch06.interfaces.basic;

public class ComparableRectangle extends Rectangle implements Comparable {
	public ComparableRectangle(double width, double height) {
		super(width, height);
	}
	public int compareTo(Object obj) {
		if(getArea() < ((ComparableRectangle)obj).getArea())
			return -1;
		else if(getArea() > ((ComparableRectangle)obj).getArea())
			return 1;
		else return 0;
	}
}
