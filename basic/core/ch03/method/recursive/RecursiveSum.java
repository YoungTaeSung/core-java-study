package core.ch03.method.recursive;

import javax.swing.JOptionPane;

public class RecursiveSum {
	public static void main(String[] args) {
		String inputStr = JOptionPane.showInputDialog("정수를 입력하세요.!");
		int inputValue = Integer.parseInt(inputStr);
		
		System.out.println("합: "+ recursiveSum(inputValue));
		System.exit(0);
	}

	private static int recursiveSum(int inputValue) {
		if(inputValue == 0) {
			return 0;
		} else {
			return inputValue + recursiveSum(inputValue - 1);
		}
	}
}
