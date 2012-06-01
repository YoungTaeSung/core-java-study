package core.ch05.inheritance.abs;

public abstract class ABSShape {
	private int x, y;
	
	public ABSShape() { x=0; y=0; }
	public int getXPos() { return x; }
	public int getYPos() { return y; }
	public void setXPos(int _x) { x=_x; }
	public void setYPos(int _y) { y=_y; }
	
	//��� subclass�� ���������� ������ �޼���
	//subclass�� ���� ������ �޶���
	//�θ�Ŭ���������� ���� ����� �� �� ����!!(abstract)
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
