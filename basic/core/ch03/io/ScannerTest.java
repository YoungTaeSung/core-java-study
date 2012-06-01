package core.ch03.io;

import java.util.Scanner;

public class ScannerTest {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		String str = in.next();
		System.out.println("읽어 온 문자열은 "+str+"입니다.");
		
		int intValue = in.nextInt();
		System.out.println("읽어 온 정수는 "+intValue+"입니다.");
		
		double doubleValue = in.nextDouble();
		System.out.println("읽어 온 정수는 "+doubleValue+"입니다.");
	}
}
