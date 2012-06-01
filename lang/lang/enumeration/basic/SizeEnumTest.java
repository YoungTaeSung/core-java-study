package lang.enumeration.basic;

public class SizeEnumTest {
	public static void main(String[] args) {
		SizeEnum mySize = SizeEnum.SMALL;
		
		System.out.println(mySize);
		System.out.println(mySize.toString());
		System.out.println(mySize.getAbbreviation());
		
		mySize.setAbbreviation("SM");
		System.out.println(mySize.getAbbreviation());
		
		System.out.println(mySize.name());
		
		if(!"SMALL".equals(mySize.name()))
			System.out.println("Something wrong!!");
		
		SizeEnum large = Enum.valueOf(SizeEnum.class, "LARGE");
		System.out.println(large);

		SizeEnum[] sizeArray = SizeEnum.values();
		for(SizeEnum s : sizeArray)
			System.out.println(s.getAbbreviation());
		
		System.exit(0);
	}
}
