package core.ch05.enumeration;

public class EnumSizeTest {
	public static void main(String[] args) {
		EnumSize esSmall = Enum.valueOf(EnumSize.class, "SMALL");
		EnumSize esExlarge = Enum.valueOf(EnumSize.class, "XLARGE");

		int mediumValuePos = EnumSize.MEDIUM.ordinal();
		System.out.println("Value(MEDIUM)_pos="+mediumValuePos);
		
		EnumSize[] values = EnumSize.values();
		for(EnumSize e : values) {
			System.out.println(e.toString());
		}
		System.exit(0);
	}
}
