package core.ch03.method;

public class Palindrome {
	public static boolean isPalindrome(String word) {
		if(word.length() <= 1)
			return true;
		else if(word.charAt(0) != word.charAt(word.length()-1))
			return false;
		else
			return isPalindrome(word.substring(1, word.length()-1));
	}
	public static void main(String[] args) {
		System.out.println(isPalindrome("mom"));
		System.exit(0);
	}
}
