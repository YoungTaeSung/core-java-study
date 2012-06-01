package core.ch04.cls.accessmod;

public class AccessModifier {
	public int x;
	int y;
	private int z;
	
	public void m1() {
		System.out.println("m1");
	}
	void m2() {
		System.out.println("m2");
	}
	private void m3() {
		System.out.println("m3");
	}
	private void m4() {
		x = 100;
		m3();
	}
}
