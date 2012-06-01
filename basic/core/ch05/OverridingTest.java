package core.ch05;

public class OverridingTest {
	public static void main(String[] args) {
		Car car = new Car();
		car.showMessage();
		Car car2 = new AutoBike();
		car2.showMessage();
		System.exit(0);
	}
}
class Car {
	private String type;
	public Car() {
		type = "Car";
	}
	public void showMessage() {
		System.out.println(type);
	}
}
class AutoBike extends Car {
	public void showMessage() {
		super.showMessage();
		System.out.println("AutoBike");
	}
}