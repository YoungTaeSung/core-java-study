package core.ch03.method.recursive;

import javax.swing.JOptionPane;

public class RecursiveSum {
	public static void main(String[] args) {
		String inputStr = JOptionPane.showInputDialog("������ �Է��ϼ���.!");
		int inputValue = Integer.parseInt(inputStr);
		
		System.out.println("��: "+ recursiveSum(inputValue));
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
