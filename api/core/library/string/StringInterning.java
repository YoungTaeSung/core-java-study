package core.library.string;

public class StringInterning {
	public static void main(String[] args) {
		String hello1 = "Hello, Java";
		String hello2 = new String("Hello, Java");
		String hello3 = hello1.intern();
		String hello4 = "Hello, Java";
		
		//Compare String References
		System.out.println("1 and 2: "+(hello1 == hello2));
		System.out.println("1 and 3: "+(hello1 == hello3));
		System.out.println("1 and 4: "+(hello1 == hello4));
		
		System.exit(0);
	}
}
