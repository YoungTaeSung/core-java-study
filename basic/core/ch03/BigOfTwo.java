package core.ch03;

import java.util.Scanner;

/*
 * �ǽ�����: �� ������ ū �� ����ϱ�
 */
public class BigOfTwo {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int first = input.nextInt();
		int second = input.nextInt();

		if (first > second)
			System.out.println("Result=" + first);
		else
			System.out.println("Result=" + second);

		System.exit(0);
	}

}
