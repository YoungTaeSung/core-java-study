package core.ch03.problem;

import java.text.DecimalFormat;
import java.util.Random;
import java.util.Scanner;

public class ValidateTriangle {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("�� ���� ���̸� ���ʷ� �Է��ϼ���(��. 10 2 4).");
		
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
