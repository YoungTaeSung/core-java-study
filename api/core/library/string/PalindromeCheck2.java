package core.library.string;

import javax.swing.JOptionPane;

public class PalindromeCheck2 {
	public static String readInput() {
		return JOptionPane.showInputDialog("Enter");
	}
	public static String filterNonAlphabet(String str) {
		StringBuffer tmp_str = new StringBuffer();
		for(int i=0; i < str.length(); i++)
			if(Character.isLetter(str.charAt(i)))
				tmp_str.append(str.charAt(i));
		System.out.println("Filter Result: "+tmp_str);
		return tmp_str.toString();
	}
	public static boolean isPalindrome(String str) {
		String filterStr = filterNonAlphabet(str);
		return filterStr.equals(reverseStr(filterStr));
	}
	public static String reverseStr(String str) {
		return new StringBuffer(str).reverse().toString();
	}
	public static void main(String[] args) {
		String input = readInput();
		String resultStr = "Input: " + input;
		if(isPalindrome(input))
			resultStr += ": OK!";
		else
			resultStr += ": NO!";
		JOptionPane.showMessageDialog(null, resultStr);
		System.exit(0);
	}
}
