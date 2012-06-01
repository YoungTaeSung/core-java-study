package core.ch05.enumeration;

public class SizeEnumTest {
	public static void main(String[] args) {
		Size large = Size.LARGE;
		Size small = Size.SMALL;
		Size medium = Size.MEDIUM;
		Size exlarge = Size.EXLARGE;
		if(large == small) {
			System.out.println("Same Size");
		}
		System.exit(0);
	}
}
