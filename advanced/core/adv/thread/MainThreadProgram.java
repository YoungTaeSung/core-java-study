package core.adv.thread;

import java.util.Scanner;

public class MainThreadProgram {
	private final static int MAX=1000;
	
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.print("Input Anything: ");
		String inputStr = in.next();
		
		int sum=0;
		for(int i=0; i<MAX; i++) {
			sum += i;
		}
		System.out.println("Total Sum = "+sum);
		System.out.println("Input String = "+inputStr);
		System.out.println("System Exit.");
		System.exit(0);
	}
}
