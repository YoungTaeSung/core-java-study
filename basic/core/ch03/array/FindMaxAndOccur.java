package core.ch03.array;

import javax.swing.JOptionPane;

public class FindMaxAndOccur {
	public static void main(String[] args) {
		// �迭�� ũ�⸦ 6���� ����
		final int TOTAL_NUMBERS = 6;
		// �迭 ����
		int[] numbers = new int[TOTAL_NUMBERS];
		
		// 6���� ������ �Է� ����
		for (int i = 0; i < numbers.length;  i++) {
			String numString = JOptionPane.showInputDialog("Enter a number:");
			// �Է¹��� ���ڿ��� ������ ��ȯ
			numbers[i] = Integer.parseInt(numString);
		}
		
		// ���� ū �� ã��
		int max = numbers[0];
		for (int i = 1; i < numbers.length; i++) {
			if (max < numbers[i])
				max = numbers[i];
		}
		
		// ���� ū ���� �� ����
		int count = 0;
		for (int i = 0; i < numbers.length; i++) {
			if (numbers[i] == max) count++;
		}
		
		// ��� ���
		String output = "The array is ";
		for (int i = 0; i < numbers.length; i++) {
			output += numbers[i] + " ";
		}
		
		output += "\nThe largest number is " + max;
		output += "\nThe occurrence count of the largest number "
			+ "is " + count;
		
		// ��� ��� �� ���α׷� ����
		JOptionPane.showMessageDialog(null, output);
		System.exit(0);
	}
}
