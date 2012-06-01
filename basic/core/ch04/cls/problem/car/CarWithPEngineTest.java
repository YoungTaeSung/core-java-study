package core.ch04.cls.problem.car;

public class CarWithPEngineTest {
	public static void main(String[] args) {
		CarWithPEngine myNewCar = new CarWithPEngine();
		myNewCar.speedDown();
		System.out.println(myNewCar);

		CarWithPEngine avante = new CarWithPEngine("Hyundai", "Normal");
		System.out.println(avante);
		avante.speedUp(10);
		System.out.println(avante);
		avante.speedUp(100);
		System.out.println(avante);
		avante.speedDown(50);
		System.out.println(avante);
		avante.speedDown();
		System.out.println(avante);
		avante.speedUp();
		System.out.println(avante);
		avante.speedDown(200);
		System.out.println(avante);
		
		System.exit(0);
	}
}
