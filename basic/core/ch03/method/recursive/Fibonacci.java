package core.ch03.method.recursive;

import javax.swing.JOptionPane;

public class Fibonacci {
	public static void main(String[] args) {
		String inputStr = JOptionPane.showInputDialog("Input Number N(N => 0)");
		int number = Integer.parseInt(inputStr);
		JOptionPane.showMessageDialog(null, number+" Fibonacci\n"+fibonacci(number));
		System.exit(0);
	}
	private static int fibonacci(int number) {
		if(number == 0)
			return 0;
		else if(number == 1)
			return 1;
		else
			return fibonacci(number - 2) + fibonacci(number - 1);
	}
}
