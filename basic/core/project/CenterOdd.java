package core.project;

import java.util.Random;

public class CenterOdd {
	public static void main(String[] args) {
		//step1. dec. vars;
		int count = 0, oddNCount=0;
		Random rGenerator = new Random();
		int oddNArray[] = new int[30];
		
		//step2. generate random number 0 ~ 99
		while(count++ != 15) {
			int temp = rGenerator.nextInt(100)+1;
			//System.out.println(temp);
			if(temp % 2 != 0) {
				oddNArray[oddNCount++] = temp;
				System.out.print(temp+" ");
			}
		}
		System.out.println();
		
		//step3. show result
		if(oddNCount % 2 == 0) {
			System.out.println("Even Number of Elements!");
		} else {
			System.out.println("Center Odd N = "+oddNArray[oddNCount/2]);
		}
		System.exit(0);
	}
}
