package core.ch03.problem;

import java.util.Scanner;

public class SquareNumber {
	public static boolean isSquareNumber(int number) {
		int result = (int)(Math.sqrt(number));
		return (Math.pow(result, 2) == number);
	}
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.print("������ �Է��ϼ���: ");
		int counter = in.nextInt();
		
		for(int i=1; i <= counter; i++) {
			if(isSquareNumber(i))
				System.out.println(i+"�� �������� �½��ϴ�.");
			else
				System.out.println(i+"�� �������� �ƴմϴ�.");
		}
		System.exit(0);
	}
}