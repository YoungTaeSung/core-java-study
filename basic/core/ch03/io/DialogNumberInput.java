package core.ch03.io;

import javax.swing.JOptionPane;

public class DialogNumberInput {
	public static void main(String[] args) {
		String input = JOptionPane.showInputDialog(null, "Enter Number", "Input Dialog Example", JOptionPane.QUESTION_MESSAGE);
		
		int value = Integer.parseInt(input);
		double dValue = Double.parseDouble(input);
		
		System.out.println("Value = "+(value+10));
		System.out.println("Value = "+(dValue+10));
		System.exit(0);
	}
}
