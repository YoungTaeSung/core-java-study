package java7.enhanced.binary;

public class BinaryLiteralTest {
	public static void test() {
		int x = 0b100;
	}
	public static void main(String[] args) {
		int value = Integer.parseInt("100100", 2); 
		System.out.println(value);
		System.exit(0);
	}
}
