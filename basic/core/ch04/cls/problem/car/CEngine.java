package core.ch04.cls.problem.car;

public class CEngine {
	private int max_speed;
	private String type;
	
	public CEngine() {
		type="Normal"; max_speed=100;
	}
	public CEngine(String type) {
		if(type.equalsIgnoreCase("Normal")) {
			this.type="Normal"; max_speed=100;
		} else if(type.equalsIgnoreCase("Turbo")) {
			this.type="Turbo"; max_speed=200;
		} else if(type.equalsIgnoreCase("Super")) {
			this.type="Super"; max_speed=400;
		} else {
			this.type="unknown"; max_speed=50;
		}
	}
	public String getType() { return type; }
	public int getMaxSpeed() { return max_speed; }
	public String toString() {
		return "Engine(type:"+type+", maxSpeed:"+max_speed+")";
	}
}
