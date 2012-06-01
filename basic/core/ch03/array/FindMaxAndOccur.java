package core.ch03.array;

import javax.swing.JOptionPane;

public class FindMaxAndOccur {
	public static void main(String[] args) {
		// 배열의 크기를 6으로 고정
		final int TOTAL_NUMBERS = 6;
		// 배열 생성
		int[] numbers = new int[TOTAL_NUMBERS];
		
		// 6개의 정수를 입력 받음
		for (int i = 0; i < numbers.length;  i++) {
			String numString = JOptionPane.showInputDialog("Enter a number:");
			// 입력받은 문자열를 정수로 변환
			numbers[i] = Integer.parseInt(numString);
		}
		
		// 가장 큰 수 찾기
		int max = numbers[0];
		for (int i = 1; i < numbers.length; i++) {
			if (max < numbers[i])
				max = numbers[i];
		}
		
		// 가장 큰 수의 빈도 세기
		int count = 0;
		for (int i = 0; i < numbers.length; i++) {
			if (numbers[i] == max) count++;
		}
		
		// 결과 출력
		String output = "The array is ";
		for (int i = 0; i < numbers.length; i++) {
			output += numbers[i] + " ";
		}
		
		output += "\nThe largest number is " + max;
		output += "\nThe occurrence count of the largest number "
			+ "is " + count;
		
		// 결과 출력 및 프로그램 종료
		JOptionPane.showMessageDialog(null, output);
		System.exit(0);
	}
}
