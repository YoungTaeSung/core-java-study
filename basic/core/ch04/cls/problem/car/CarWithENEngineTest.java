package core.ch04.cls.problem.car;

public class CarWithENEngineTest {
	public static void main(String[] args) {
		CarWithENEngine myNewCar = new CarWithENEngine("Hyundai", ENEngine.NORMAL);
		myNewCar.speedDown();
		System.out.println(myNewCar);

		CarWithENEngine A8 = new CarWithENEngine("Audi", ENEngine.SUPER);
		System.out.println(A8);
		A8.speedUp(10);
		System.out.println(A8);
		A8.speedUp(200);
		System.out.println(A8);
		A8.speedDown(50);
		System.out.println(A8);
		A8.speedDown();
		System.out.println(A8);
		A8.speedUp();
		System.out.println(A8);
		A8.speedDown(200);
		System.out.println(A8);
		
		System.exit(0);
	}
}
