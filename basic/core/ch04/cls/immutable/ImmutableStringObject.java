package core.ch04.cls.immutable;

public class ImmutableStringObject {
	public static void main(String[] args) {
		String hello = "Hello";
		System.out.println(hello.hashCode());
		String str = "Hello";
		System.out.println(str.hashCode());
		
		if(hello == str) {
			System.out.println("Two RefVar refer to Same Object!");
		} else {
			System.out.println("Two RefVar refer to Different Object!");
		}
		
		if(hello.equals(str)) {
			System.out.println("Two RefVar is Same");
		} else {
			System.out.println("Two RefVar is Different");
		}
		System.exit(0);
	}
}
