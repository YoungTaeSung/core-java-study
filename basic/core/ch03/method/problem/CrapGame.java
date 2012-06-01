package core.ch03.method.problem;

import java.util.Random;

public class CrapGame {
	private static final int YOU_WIN = 1;
	private static final int YOU_LOSE = 2;
	private static final int ONE_MORE_CHANCE = 3;
	
	public static void main(String[] args) {
		//주사위 2개 던지기
		int firstDraw = getDraw();
		int secondDraw = getDraw();
		int drawResult = firstDraw + secondDraw;
		
		System.out.println("F="+firstDraw+", S="+secondDraw+"("+drawResult+")");
		
		//Win 검사!
		switch(winCheck(drawResult)) {
		case YOU_WIN:
			System.out.println("You Win!");
			break;
		case YOU_LOSE:
			System.out.println("You Lose!");
			break;
		case ONE_MORE_CHANCE:
			oneMoreDraw(drawResult);
			break;
		}
		System.out.println("Done!");
		System.exit(0);
	}
	private static void oneMoreDraw(int drawResult) {
		int first=0, second=0;
		for(int i = 0; i < 7; i++) {
			first = getDraw(); second = getDraw();
			System.out.println("--Retry "+ i + " F="+first+", S="
									+ second + "(" + (first+second) + ")");
			if(drawResult == first+second) {
				System.out.println("You Win!");
				return;
			}
		}
		System.out.println("You Lose!");
	}
	public static int winCheck(int drawResult) {
		int result = 0;
		switch(drawResult) {
			case 7: case 11: result = YOU_WIN; break;
			case 2: case 3: case 12: result = YOU_LOSE; break;
			case 4: case 5: case 6: case 8: case 9: case 10: result = ONE_MORE_CHANCE; break;
		}
		return result;
	}
	public static int getDraw() {
		return new Random().nextInt(6) + 1;
	}
}
