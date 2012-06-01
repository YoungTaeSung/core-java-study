package core.string;

public class StringCompareDemo {
	public static void main(String[] args) {
		String str1 = "Hello";
		String str2 = "Hello";
		
		if(str1 == str2)
			System.out.println("Same Reference");
		else
			System.out.println("Different Reference");
		System.exit(0);
	}
}