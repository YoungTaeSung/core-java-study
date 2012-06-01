package core.ch05;

public class ToStringTest {
	public static void main(String[] args) {
		MyCar car1 = new MyCar("Avante", "20110201");
		System.out.println(car1);
		System.exit(0);
	}
}
class MyCar {
	private String name;
	private String productNumber;
	public MyCar(String n, String id) {
		name = n;
		productNumber = id;
	}
	public String toString() {
		return "Car Name: "+name+" ProductID: "+productNumber;
	}
}
