package core.ch05.inheritance.object;

class Parent {
	public void show() {
		System.out.println(this.getClass());
	}
}
class Child extends Parent {
	public void print() {
		show();
	}
}
public class GetClassTest2 {
	public static void main(String[] args) {
		Child object = new Child();
		object.print();
		
		System.exit(0);
	}
}
