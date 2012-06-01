package core.ch05.inheritance;

public class DefaultConstTest extends SuperClass{
	public static void main(String[] args) {
	}
}
//package-private class
class SuperClass {
	public SuperClass() {}
	public SuperClass(String msg) {
		System.out.println("SuperClass's constructor invoked!");
		System.out.println(msg);
	}
}
