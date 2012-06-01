package core.ch04.cls;

public class Immutable {
	private int one;
	private String name;
	
	public Immutable() {
		one = 1;
		name = "NAME";
	}
	public int getOne() {
		return one;
	}
	public String getName() {
		return name;
	}
}
