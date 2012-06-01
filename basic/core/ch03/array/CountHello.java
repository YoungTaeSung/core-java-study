package core.ch03.array;

import javax.swing.JOptionPane;

public class CountHello {
	public static String readInputString(String text) {
		String in = JOptionPane.showInputDialog(text);
		return in;
	}
	public static int checkSubString(String original, String target) {
		int originalLength = original.length();
		String tmpString = original.replace(target, "");
		int removedLength = tmpString.length();
		return (originalLength-removedLength)/target.length();
	}
	public static void main(String[] args) {
		String inputString = readInputString("Input Full String");
		String countString = readInputString("Input Count String");
		
		System.out.println("Total Count = "+checkSubString(inputString, countString));
		

		System.exit(0);
	}
}
