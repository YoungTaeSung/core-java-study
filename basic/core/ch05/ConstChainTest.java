package core.ch05;

public class ConstChainTest extends Employee2 {
	public static void main(String[] args) {
		new ConstChainTest();
	}
	public ConstChainTest() {
		System.out.println("(4) Faculty's no-arg constructor is invoked");
	}
}
class Employee2 extends Person {
	public Employee2() {
		this("(2) Invoke Employee's overloaded constructor");
		System.out.println("(3) Employee's no-arg constructor is invoked");
	}
	public Employee2(String s) {
		System.out.println(s);
	}
}
class Person {
	public Person() {
		System.out.println("(1) Person's no-arg constructor is invoked");
	}
}