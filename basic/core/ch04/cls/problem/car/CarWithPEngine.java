package core.ch04.cls.problem.car;

public class CarWithPEngine {
	private String brand;
	
	//1:Normal(100km), 2:Turbo(200km), 3:Super(300km)
	private String engine_type;
	private int max_speed;
	private int current_speed;
	
	private boolean is_driving;
	
	public CarWithPEngine() {
		brand="unknown"; is_driving=false;
		engine_type="unknown"; max_speed=0; current_speed=0;
	}
	public CarWithPEngine(String brand, String e_type) {
		this.brand=brand; current_speed=0; is_driving=false;
		
		if(e_type.equalsIgnoreCase("Normal")) {
			engine_type="Normal"; max_speed=100;
		} else if(e_type.equalsIgnoreCase("Turbo")) {
			engine_type="Turbo"; max_speed=200;
		} else if(e_type.equalsIgnoreCase("Super")) {
			engine_type="Super"; max_speed=400;
		} else {
			engine_type="unknown"; max_speed=0;
		}
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
		return "Car["+brand+", engine:"+engine_type+", maxSP:"+
		max_speed+", curSP:"+current_speed+", status:"+(is_driving?"driving":"stopped")+"]";
	}
}
