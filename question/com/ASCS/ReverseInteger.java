package com.ASCS;
// 2011.05.24.  Jaegon Song. 
import javax.swing.JOptionPane;

public class ReverseInteger {
	public static void main(String[] args){
		//키보드에서 양의 정수를 입력받아 입력받은 정수의 역순을 출력하는 프로그램을 작성하시오
		
		/*------------------------------
		|			다이얼로그 호출 		|
		 ------------------------------*/
		String input = JOptionPane.showInputDialog(null,
				"정수 값을 입력하세요 : ",
				"Request",
				JOptionPane.QUESTION_MESSAGE);
		int number = Integer.parseInt(input);
	
		
		int standard = 1;
		int tempstandard = 10;
		int length=0; // 변수의 길이
		

		/*------------------------------
		|			루프 				 		|
		 ------------------------------*/
		boolean condition = true;
		while(condition){
			condition = number/tempstandard != 0 ? true : false ;
			tempstandard *= 10;
			standard = tempstandard /100;  // 원래 temp 가 10 인데다가, 최초의 연산시에도 tempstandard 는 10이 곱해지므로 
			length++;
		}

		/*------------------------------
		|					변환				|
		 ------------------------------*/
		
		int loader = 1;
		int counter = 0;
		condition = true;
		int result = 0;
	
		while(condition){
			result +=((number / standard) %10)	*	loader ;
			loader *=10;
			counter++;
			standard /= 10;
			condition = counter < length ? true : false ;
		}
		JOptionPane.showMessageDialog(null, number+ "를 거꾸로 하면   " +result);
		
		System.exit(0);
	}
}

// 이 프로그램은 1000 으로 입력 하였을때에  0001 이 아닌 1로 출력함을 알 수 있다.
// 입력된 수를 int 로 파싱하지 않고 소팅하는 형식으로 완성하고자 할 때에 활용 할 수 있는 method 들을 알고 싶습니다. 
