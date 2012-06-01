package core.ch05.inheritance.abs;

public abstract class ABSShape {
	private int x, y;
	
	public ABSShape() { x=0; y=0; }
	public int getXPos() { return x; }
	public int getYPos() { return y; }
	public void setXPos(int _x) { x=_x; }
	public void setYPos(int _y) { y=_y; }
	
	//모든 subclass가 공통적으로 가지는 메서드
	//subclass에 따라 구현이 달라짐
	//부모클래스에서는 구현 방법을 알 수 없음!!(abstract)
	public abstract double getArea();
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + x;
		result = prime * result + y;
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj) return true;
		if (obj == null) return false;
		if (getClass() != obj.getClass()) return false;
		ABSShape other = (ABSShape) obj;
		if (x != other.x)
			return false;
		if (y != other.y)
			return false;
		return true;
	}
}
