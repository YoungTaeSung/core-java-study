package core.ch03.io;

import javax.swing.JOptionPane;

public class DialogInput {
	public static void main(String[] args) {
		String input = JOptionPane.showInputDialog(null, "Enter Input", "Input Dialog Example", JOptionPane.QUESTION_MESSAGE);
		System.out.println("Input Value = "+input);
		System.exit(0);
	}
}
