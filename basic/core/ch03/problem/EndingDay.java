package core.ch03.problem;

import java.util.Scanner;

public class EndingDay {
	public static void main(String[] args) {
		System.out.println("월 을 입력하세요.(1~12)");
		Scanner in = new Scanner(System.in);
		int month = in.nextInt();
		
		if(month < 1 || month > 12) {
			System.out.println("잘 못 입력하셨습니다.");
			System.exit(0);
		}
		
		// 2월: 28일
		// 4,6,9,11월: 30일
		// 그 외 : 31일
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
		System.out.println(month+"월은 "+result+"일이 마지막 날입니다.");
		System.exit(0);
	}
}