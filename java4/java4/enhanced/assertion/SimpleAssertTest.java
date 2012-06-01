package java4.enhanced.assertion;

public class SimpleAssertTest {
	public static void main(String[] args) {
		double sqrtFour = Math.sqrt(4.0);
		
		assert (sqrtFour>0);
		
		System.out.println("> sqrt 4 = " + sqrtFour);
		
		System.exit(0);
	}

}
