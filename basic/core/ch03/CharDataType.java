package core.ch03;

public class CharDataType {
	public static void main(String[] args) {
		System.out.println("\u8FCE");
		System.out.println("\u0000");
		System.out.println("\u0012");
		
		// character 'A' ASCII & Unicode
		char letter = 'A';
		System.out.println(letter);
		letter = '\u0041';
		System.out.println(letter);
		
		// apply increment operator
		System.out.println(++letter);
		System.exit(0);
	}
}
