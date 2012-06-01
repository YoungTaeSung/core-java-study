package core.ch04.cls.problem.car;

public class CarWithENEngine {
	private String brand;
	//ENEngine.NORMAL, ENEngine.TURBO, ENEngine.SUPER
	private ENEngine engine;
	private int max_speed;
	private int current_speed;
	
	private boolean is_driving;
	
	public CarWithENEngine() {
		brand="unknown"; is_driving=false;
		engine = ENEngine.NORMAL; 
		max_speed = engine.getMaxSpeed();
		current_speed=0;
	}
	public CarWithENEngine(String brand, ENEngine engine) {
		this.brand=brand; current_speed=0; is_driving=false;
		this.engine = engine;
		max_speed=engine.getMaxSpeed();
	}
	public void speedUp(int upValue) {
		//check negative value of upValue
		current_speed += upValue;
		is_driving=true;
		if(current_speed > max_speed) {
			System.out.println("Can't Exceed Max Speed");
			current_speed = max_speed;
		}
	}
	public void speedUp() {
		speedUp(15);
	}
	public void speedDown(int downValue) {
		if(is_driving) {
			current_speed -= downValue;
			if(current_speed <= 0) {
				current_speed=0;
				is_driving=false;
			}
		} else {
			System.out.println("Can't SpeedDown, Stoped!!");
		}
	}
	public void speedDown() {
		speedDown(15);
	}
	public boolean isDriving() {
		return is_driving;
	}
	public String toString() {
		return "Car["+brand+", curSP:"+current_speed+
			", status:"+(is_driving?"driving":"stopped")+"] "+engine.toString();
	}
}
