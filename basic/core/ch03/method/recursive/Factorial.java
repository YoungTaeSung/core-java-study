package core.ch03.method.recursive;

import javax.swing.JOptionPane;

public class Factorial {
	public static void main(String[] args) {
		String inputStr = JOptionPane.showInputDialog("Enter N");
		int number = Integer.parseInt(inputStr);
		JOptionPane.showMessageDialog(null, number+" Factorial\n"+factorial(number));
		System.exit(0);
	}
	public static long factorial(int n) {
		if(n == 0)
			return 1;
		else
			return n * factorial(n-1);
	}
}
