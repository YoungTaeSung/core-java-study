package java7.enhanced.string;

public class SwitchwithStringTest {
//	public static void switchWithPrimitives(int value) {
//		switch(value) {
//		case 10:
//			System.out.println(10); break;
//		case 20:
//			System.out.println(20); break;
//		default:
//			System.out.println("default");
//		}
//	}
//	public static void switchWithInteger(Integer value) {
//		switch(value) {
//		case 10:
//			System.out.println(10); break;
//		case 20:
//			System.out.println(20); break;
//		default:
//			System.out.println("default");
//		}
//	}
	public static void switchWithString(String str) {
		switch(str) {
		case "bob":
			break;
		}
	}
	public static void switchWithoutString(String str) {
		if(str.equals("bob") || str.equals("sam"))
			//do something ...
			;
		else if(str.equals("carl") || str.equals("joy"))
			//do something ...
			;
		else if(str.equals("anna") || str.equals("haron"))
			//do something ...
			;
		else
			//do something ...
			;
	}
	public static void main(String[] args) {
//		switchWithPrimitives(20);
//		switchWithPrimitives(100);
//		
//		switchWithInteger(new Integer(10));
//		switchWithInteger(new Integer(100));
		
		//switchWithString(null);
		
//		System.exit(0);
	}
}
