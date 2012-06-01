package core.library.character;

import javax.swing.JOptionPane;

public class CountChar {
	private static final int TOTAL_NUM_CHAR = 26;
	
	public static String readInput() {
		return JOptionPane.showInputDialog("Enter String");
	}
	public static int[] countLetters(String input) {
		int[] counts = new int[TOTAL_NUM_CHAR];

		for (int i = 0; i < input.length(); i++) {
			if (Character.isLetter(input.charAt(i)))
				counts[input.charAt(i) - 'a']++;
		}
		return counts;
	}
	public static void main(String[] args) {
		String inputStr = readInput();

		int[] counts = countLetters(inputStr.toLowerCase());

		String output = "";
		for (int i = 0; i < counts.length; i++) {
			if (counts[i] != 0)
				output += (char) ('a' + i) + " :   " + counts[i]
						+ ((counts[i] == 1) ? " time\n" : " times\n");
		}
		JOptionPane.showMessageDialog(null, output);
		System.exit(0);
	}
}
