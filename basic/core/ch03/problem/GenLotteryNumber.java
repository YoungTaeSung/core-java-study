package core.ch03.problem;

import java.util.Arrays;
import java.util.Scanner;

public class GenLotteryNumber {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		System.out.print("추출할 로또번호의 수와 최대 수: ");
		int nNumber = in.nextInt();
		int maxNumber = in.nextInt();
		
		long startTime = System.currentTimeMillis();
		
		int[] lotteryArray = new int[maxNumber];
		for(int i=0; i < lotteryArray.length; i++)
			lotteryArray[i] = i+1;
		
		int[] resultArray = new int[nNumber];
		for(int i=0; i < resultArray.length; i++) {
			int r = (int)(Math.random()*maxNumber);
			resultArray[i] = lotteryArray[r];
			lotteryArray[r] = lotteryArray[maxNumber-1];
			--maxNumber;
		}
		Arrays.sort(resultArray);
		long endTime = System.currentTimeMillis();
		System.out.println("Time: "+(endTime-startTime)/1000);
		System.out.print("Result Lottery Number = ");
		//System.out.println(Arrays.toString(resultArray));
		System.exit(0);
	}
}
