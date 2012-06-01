package core.ch03.problem;

import java.util.Scanner;

public class SquareNumber {
	public static boolean isSquareNumber(int number) {
		int result = (int)(Math.sqrt(number));
		return (Math.pow(result, 2) == number);
	}
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.print("정수를 입력하세요: ");
		int counter = in.nextInt();
		
		for(int i=1; i <= counter; i++) {
			if(isSquareNumber(i))
				System.out.println(i+"는 제곱수가 맞습니다.");
			else
				System.out.println(i+"는 제곱수가 아닙니다.");
		}
		System.exit(0);
	}
}