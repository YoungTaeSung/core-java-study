package core.ch06.interfaces.basic;

public class MovableInterfaceTest {
	public static void moveSomething(Movable mv) {
		while(mv.getMovableState()) {
			mv.move();
		}
		System.out.println(mv.getMoveResult());
	}
	public static void main(String[] args) {
		System.exit(0);
	}
}
