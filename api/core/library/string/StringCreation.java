package core.library.string;

public class StringCreation {
	public static void main(String[] args) {
		String helloStr1 = new String("Hello");
		String helloStr2 = "Hello";
		char[] helloChar = {'H', 'e', 'l', 'l', 'o' };
		String helloStr3 = new String(helloChar);
		
		System.out.println(helloStr1 + " " + helloStr2 + " " + helloStr3);
		System.exit(0);
	}
}
