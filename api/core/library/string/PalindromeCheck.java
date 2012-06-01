package core.library.string;

import javax.swing.JOptionPane;

public class PalindromeCheck {
	public static String readInput() {
		return JOptionPane.showInputDialog("Enter String");
	}
	public static boolean isPalindrome(String input) {
		int low = 0;
		int high = input.length()-1;
		while(low < high) {
			if(input.charAt(low) != input.charAt(high))
				return false;
			low++; high--;
		}
		return true;
	}
	public static void main(String[] args) {
		String input = readInput();
		if(isPalindrome(input)) {
			System.out.println("Input: "+input+"(True)");
		} else {
			System.out.println("Input: "+input+"(False)");
		}
		System.exit(0);
	}
}
