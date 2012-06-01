package core.ch04.cls.problem.car;

public enum ENEngine {
	//�� 3�� ��ü�� ������ ��Ư�� Ŭ����!!
	NORMAL("Normal", 100), TURBO("Turbo", 200), SUPER("Super", 400);
	
	private String name;
	private int max_speed;
	
	private ENEngine(String name, int max_sp) { 
		this.name=name;
		max_speed = max_sp; 
	}
	public String getType() { return name; }
	public int getMaxSpeed() { return max_speed; }
	public String toString() {
		return "Engine(type:"+name+", maxSpeed:"+max_speed+")";
	}
}