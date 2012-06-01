package core.ch03.array;

public class ThreeDimArrayTest {
	public static void main(String[] args) {
		int[][][] seats = new int[3][2][4];
		
		int numberOfPage = seats.length;
		System.out.println("nPage = "+numberOfPage);
		
		int numberOfRow = seats[0].length;
		System.out.println("0's nRow = "+numberOfRow);

		int numberOfCol = seats[0][0].length;
		System.out.println("[0][0]'s nCol = "+numberOfCol);
		
		System.exit(0);
	}
}