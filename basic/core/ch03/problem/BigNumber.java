package core.ch03.problem;

import javax.swing.JOptionPane;

public class BigNumber {
	public static void main(String[] args) {
		int first = Integer.parseInt(JOptionPane.showInputDialog(null));
		int second = Integer.parseInt(JOptionPane.showInputDialog(null));
		int third = Integer.parseInt(JOptionPane.showInputDialog(null));
		System.out.println(first+" "+second+" "+third);
		int max = 0;
		
		if(first > second) {
			if(first > third)
				max = first;
			else
				max = third;
		} else {
			if(second > third)
				max = second;
			else
				max = third;
		}
		System.out.println("First Try, Max = "+max);
		System.exit(0);
	}
}