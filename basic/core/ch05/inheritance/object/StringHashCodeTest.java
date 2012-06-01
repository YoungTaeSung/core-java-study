package core.ch05.inheritance.object;

public class StringHashCodeTest {
	public static void main(String[] args) {
		System.out.println(new String("Hello").hashCode());
		System.out.println(Integer.toHexString(new String("Hello").hashCode()));
		System.out.println(new String("Harry").hashCode());
		System.out.println(new String("Hacker").hashCode());
		
		System.exit(0);
	}
}
