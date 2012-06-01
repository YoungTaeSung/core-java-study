package problems.string.reverse;

import java.util.Random;

/*
 * 문자열 Reverse 시키기
 */
public class ReverseStringTest {
	
	private static final int NUM_OF_TOTAL_CHAR = 52;
	
	//basic approach#1
	public static String reverseString(String string) {
		StringBuffer strBuffer = new StringBuffer(string);
		for(int i=0; i<strBuffer.length()/2; i++) {
			char tmpChar = strBuffer.charAt(i);
			strBuffer.setCharAt(i, strBuffer.charAt(strBuffer.length()-i-1));
			strBuffer.setCharAt(strBuffer.length()-i-1, tmpChar);
		}
		return strBuffer.toString();
	}
	//basic approach#2
	public static String reverseString2(String string) {
		char[] charArray = new char[string.length()];
		for(int i=0; i<charArray.length; i++)
			charArray[i] = string.charAt(string.length()-i-1);
		return new String(charArray);
	}
	//recursive Approach
	public static String reverseStringRec(String string) {
		return reverseRec(new StringBuffer(string), 0, string.length()-1).toString();
	}
	private static StringBuffer reverseRec(StringBuffer sb, int left, int right) {
		if( Math.abs(left-right) < 2 ) {
			return sb;
		} else {
			char tmpChar = sb.charAt(left);
			sb.setCharAt(left, sb.charAt(right));
			sb.setCharAt(right, tmpChar);
			return reverseRec(sb, left+1, right-1);
		}
	}
	//using API
	public static String reverseStringAPI(String string) {
		return new StringBuffer(string).reverse().toString();
	}
	public static String generateRandomString(int length) {
		StringBuffer tmpStr = new StringBuffer();
		for(int i=0; i<length; i++) {
			tmpStr.append(generateRandomChar());
		}
		return tmpStr.toString();
	}
	//helper method
	private static char generateRandomChar() {
		final String charSet = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ";
		
		if(charSet.length() != NUM_OF_TOTAL_CHAR) {
			System.out.println("wrong length of charSet");
			System.exit(0);
		}
		int index = new Random().nextInt(charSet.length());
		return charSet.charAt(index);
	}
	public static void main(String[] args) {
		System.out.println(reverseString(""));
		System.out.println(reverseStringRec(""));
		
		System.out.println(reverseString("A"));
		System.out.println(reverseStringRec("A"));
		
		System.out.println(reverseString("AB"));
		System.out.println(reverseStringRec("AB"));
		
		System.out.println(reverseString("ABA"));
		System.out.println(reverseStringRec("ABA"));
		
		System.out.println(reverseString("ACBC"));
		System.out.println(reverseStringRec("ACBC"));
		
		String randomString = generateRandomString(1000);
		System.out.println(randomString);
		System.out.println(reverseString(randomString));
		System.out.println(reverseStringRec(randomString));
		
		System.out.println(reverseString2(randomString));
		System.out.println(reverseString2(reverseString2(randomString)));
		
		System.out.println(reverseStringAPI(randomString));
		System.out.println(reverseStringAPI(reverseStringAPI(randomString)));
		
		System.out.println("> done");
		System.exit(0);
	}
}
