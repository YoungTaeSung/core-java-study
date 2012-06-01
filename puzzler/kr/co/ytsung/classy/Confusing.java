package kr.co.ytsung.classy;

public class Confusing {
	private Confusing(Object object) {
		System.out.println("Object");
	}
	private Confusing(double[] dArray) {
		System.out.println("Double Array");
	}
	public static void main(String[] args) {
		new Confusing(null);
		System.exit(0);
	}
}
