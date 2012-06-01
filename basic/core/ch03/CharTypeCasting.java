package core.ch03;

public class CharTypeCasting {
	public static void main(String[] args) {
		// integer to char
		char c = (char)0xA0041;
		System.out.println(c);
		
		// floating-point to char
		c = (char)65.12;
		System.out.println(c);
		
		System.exit(0);
	}
}