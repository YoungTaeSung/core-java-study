package core.ch03.io;

import java.util.Scanner;

public class ScannerTest {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		String str = in.next();
		System.out.println("�о� �� ���ڿ��� "+str+"�Դϴ�.");
		
		int intValue = in.nextInt();
		System.out.println("�о� �� ������ "+intValue+"�Դϴ�.");
		
		double doubleValue = in.nextDouble();
		System.out.println("�о� �� ������ "+doubleValue+"�Դϴ�.");
	}
}
