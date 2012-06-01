package com; //패키지 명 

import java.util.Scanner; //Scanner 기능을 사용하기 위한 라이브러리.

public class Test { //클래스 명
	
	public static void main(String[] args) { // 메인 함수 시작
		/* 세부적인 내용이 약간 다르지만, 큰 수&작은 수 비교하는 if문 제외하고는  핵심 알고리즘은 그대로 적용했습니다. */
		/* 다이얼로그는 나중에 적용해도 되기때문에, 일단 편하게 Scanner를 이용했습니다. */
		
		Scanner in = new Scanner(System.in); //입력 값을 받기 위한 Scanner in  정의.

		int Input_Num1, Input_Num2; // 숫자 입력값 1과 2.
		int GCD=1; //최대공약수가 곱해져서 누적 저장이 될 GCD 변수. 
		int i, tmp; //for문에 필요한 변수 i , 입력한 두 수의 크기 비교를 위한 tmp 변수.
		int result_num1, result_num2; //입력한 두 수를 복사 시킨 변수입니다. for문안에서 값이 변하기 때문에...
		int even_num=0; //Input_Num1을 복사시킨 변수 입니다.

		System.out.print("첫 번째 숫자 입력 : ");
		Input_Num1 = in.nextInt(); //첫 번째 입력 숫자를 Input_Num1에 저장.

		System.out.print("두 번째 숫자 입력 : ");
		Input_Num2 = in.nextInt(); //두 번째 입력 숫자를 Input_Num2에 저장.

		/* 입력 값 중 작은 수가 Input_Num1이 되도록 하는 조건식이 꼭 필요합니다. */
		if(Input_Num1 > Input_Num2){ //첫번째 숫자가 두번째 숫자보다 클 경우
			tmp = Input_Num1; //첫번째 숫자를 다른곳에 옮겨놓고
			Input_Num1 = Input_Num2; //두번째 숫자를 첫번째숫자의 변수에 저장.
			Input_Num2 = tmp; //옮겨놓은 첫번째 숫자값을 두번째 숫자의 변수에 저장.
		}//if문 종료

		even_num = Input_Num1; //for문안에서 Input_Num1값이 변하므로, 미리 even_num 변수에 복사
		result_num1 = Input_Num1; //Input_Num1을 복사 하지 않으면, 최종 출력문에 바뀐 Input_Num1값이 나오므로
		result_num2 = Input_Num2; //Input_Num2을 복사 하지 않으면, 최종 출력문에 바뀐 Input_Num2값이 나오므로
		
		/*문제가 되는 for문입니다.사실 이문제는 그렇게 생소하거나 막막한 문제는 아니었던 것 같습니다.
		그런데 오늘 앞에서 타학생이 발표했던 for문 속에 엄청난 오류가 있었습니다.
		사실 제가 이 부분때문에 다 풀지 못했다고 생각되서 손을 안들었습니다. 
		입력값이 만약에 16과 20이라면, 최대공약수는 2를 2번 나눌 수 있기때문에, 4가 됩니다.
		하지만 전단계에서 이미 i값이 2일때 계산이 끝났고, 3으로 증가된 상태이기때문에, 2로 다시 나눌 수 없습니다.
		실제로도 16과 20을 넣으면 최대공약수는 터무니없이 2라고 나옵니다. 
		이 문제는 최대공약수 알고리즘보다도 어떻게보면 훨씬 중요한 키포인트라고 생각합니다.*/
		
		for(i=1; i<=even_num; i++){ //i는 최대공약수의 기본값 1을 위해서 0이 아닌 1부터 시작해서 두 수중 작은 수와 같아질 때 까지 증가.
			if((result_num1%i == 0)&&(result_num2%i == 0)){	//첫번째 수와 두번째 수 모두다 i로 나누었을때 딱 떨어진다면...
				result_num1 /= i; //result_num1에서 i를 나눈 몫을 result_num1에 저장.
				result_num2 /= i; //result_num2에서 i를 나눈 몫을 result_num2에 저장.
				GCD *= i; //GCD와 i를 곱한 결과를 GCD에 저장.	
				i=1; //가장 중요한 부분입니다. 다시 i값을 1로 초기화 시켜 줘야 제대로 된 값이 나옵니다.
			} //if문 종료
		}//for문 종료
		
		System.out.println(""+Input_Num1+","+Input_Num2+" 최대 공약수 : "+GCD+" \n");
		System.exit(0); //0값을 반환하고, 메인 함수 종료
	}
}