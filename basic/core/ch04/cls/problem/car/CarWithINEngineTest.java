package core.ch04.cls.problem.car;

public class CarWithINEngineTest {
	public static void main(String[] args) {
		CarWithINEngine myNewCar = new CarWithINEngine("Hyundai", new INNormalEngine());
		myNewCar.speedDown();
		System.out.println(myNewCar);

		CarWithINEngine A8 = new CarWithINEngine("Audi", new INSuperEngine());
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
