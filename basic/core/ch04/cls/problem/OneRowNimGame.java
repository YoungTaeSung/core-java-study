package core.ch04.cls.problem;

public class OneRowNimGame {
	private int nStick;
	private int player;
	
	public OneRowNimGame() {
		nStick = 7; player = 1;
	}
	public OneRowNimGame(int sticks) {
		nStick = sticks; player = 1;
	}
	private void changePlayer() {
		player = 3 - player;
	}
	public void takeOneStick() {
		nStick -= 1;
		changePlayer();
	}
	public void takeTwoStick() {
		nStick -= 2;
		changePlayer();
	}
	public void takeThreeStick() {
		nStick -= 3;
		changePlayer();
	}
	public void report() {
		if(nStick == 1) {
			System.out.println("Player "+player+": Lose!!");
			System.exit(0);
		}
		System.out.println("Number of Sticks Left: " + nStick);
		showSticks();
		System.out.println("Next Player = " + player);
	}
	private void showSticks() {
		for(int i=0; i < nStick; i++)
			System.out.print("I ");
		System.out.println();
	}
}
