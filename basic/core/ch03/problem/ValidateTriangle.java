package core.ch03.problem;

import java.text.DecimalFormat;
import java.util.Random;
import java.util.Scanner;

public class ValidateTriangle {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("세 변의 길이를 차례로 입력하세요(예. 10 2 4).");
		
		int first = in.nextInt();
		int second = in.nextInt();
		int third = in.nextInt();
		
		if((first+second>third)&&(first+third>second)&&(second+third>first)) {
			System.out.println("Valid Triangle");
		} else {
			System.out.println("Invalid Triangle");
		}
		System.exit(0);
	}
}
