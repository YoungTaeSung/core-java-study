package core.ch03.problem;

import java.util.Scanner;

public class EndingDay {
	public static void main(String[] args) {
		System.out.println("�� �� �Է��ϼ���.(1~12)");
		Scanner in = new Scanner(System.in);
		int month = in.nextInt();
		
		if(month < 1 || month > 12) {
			System.out.println("�� �� �Է��ϼ̽��ϴ�.");
			System.exit(0);
		}
		
		// 2��: 28��
		// 4,6,9,11��: 30��
		// �� �� : 31��
		int result = 0;
		
		switch(month) {
		case 2:
			result = 28;
			break;
		case 4:
		case 6:
		case 9:
		case 11:
			result = 30;
			break;
		default:
			result = 31;
			break;
		}
		System.out.println(month+"���� "+result+"���� ������ ���Դϴ�.");
		System.exit(0);
	}
}