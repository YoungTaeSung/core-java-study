package core.ch03.problem;

import java.util.Scanner;

public class ReverseInteger {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int number = in.nextInt();
		int count = 0;
		do {
			System.out.println(number%10);
			number = number / 10;
			count++;
		} while(number > 0);
		System.exit(0);
	}
}
