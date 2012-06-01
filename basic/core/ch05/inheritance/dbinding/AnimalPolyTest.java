package core.ch05.inheritance.dbinding;

class Animal {
	public void sleep() {
		System.out.println("Animal.sleep()");
		snore();
	}
	public void snore() {
		System.out.println("Animal.snore()");
	}
}
class Dog extends Animal {
	@Override
	public void snore() {
		System.out.println("Dog.snore()");
	}	
}
class Cat extends Animal {
	@Override
	public void snore() {
		System.out.println("Cat.snore()");
	}
}
public class AnimalPolyTest {
	public static void main(String[] args) {
		Animal dog = new Dog();
		dog.sleep();
		Animal cat = new Cat();
		cat.sleep();
		System.exit(0);
	}
}
