package core.ch04.cls.problem.car;

/*
 * @author
 */
public class INEngine {
	private int max_speed;
	
	public INEngine() {}
	public INEngine(int max) { max_speed=max; }
	
	public int getMaxSpeed() { return max_speed; }
	public String toString() {
		return "MaxSpeed="+max_speed;
	}
}
