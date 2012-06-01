package core.ch04.cls.problem;

public class OneRowNimTest {
	public static void main(String[] args) {
		OneRowNimGame game = new OneRowNimGame(21);
		game.takeOneStick();
		game.report();
		
		game.takeThreeStick();
		game.report();
	
		game.takeTwoStick();
		game.report();
		
		System.exit(0);
	}
}
