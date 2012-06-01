package core.ch03.method.problem;

import java.util.Scanner;

public class FindingSqrt {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("정수 하나를 입력하세요: ");
		int number = input.nextInt();
		
		System.out.println(updateBValue(number));
		findSqrt(number);
		System.exit(0);
	}
	private static void findSqrt(int number) {
		// TODO Auto-generated method stub
		
	}
	private static void showPair(int a, int b) {
		System.out.println("("+a+", "+"b)");
	}
	private static int updateAValue(int a) {
		return a * 100;
	}
	private static int updateBValue(int b) {
		int headerValue = b / 10;
		int tailValue = b % 10;
		return headerValue * 100 + tailValue;
	}
	private static void findSqrtBySubstractionMethod(int number) {
		
	}
}
