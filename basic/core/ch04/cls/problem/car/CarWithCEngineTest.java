package core.ch04.cls.problem.car;

public class CarWithCEngineTest {
	public static void main(String[] args) {
		CarWithCEngine myNewCar = new CarWithCEngine("Hyundai", new CEngine());
		myNewCar.speedDown();
		System.out.println(myNewCar);

		CarWithCEngine A8 = new CarWithCEngine("Audi", new CEngine("Super"));
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
