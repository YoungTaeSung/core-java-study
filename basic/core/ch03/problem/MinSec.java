package core.ch03.problem;

import javax.swing.JOptionPane;

public class MinSec {
	public static void main(String[] args) {
		int seconds = 500;
		int minutes = seconds / 60;
		int remainingSeconds = seconds % 60;
		JOptionPane.showMessageDialog(null, seconds+" seconds is "
				+minutes+" minutes and "+
				remainingSeconds+" seconds");
		System.out.println(1.0-0.1-0.1-0.1-0.1-0.1);
		System.out.println(1.0-0.9);
		System.exit(0);
	}
}
