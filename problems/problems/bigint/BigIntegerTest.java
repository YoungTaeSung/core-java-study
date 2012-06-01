package problems.bigint;

import java.math.BigInteger;
import java.nio.ByteBuffer;
import java.nio.IntBuffer;

public class BigIntegerTest {
	public static void constructorTest() {
		BigInteger one = new BigInteger("1");
		BigInteger two = BigInteger.valueOf(2);
		
		BigInteger third = BigInteger.valueOf(1);
		BigInteger forth = BigInteger.valueOf(1);

		byte[] minusOne = {1, 0};
		BigInteger minusBigOne = new BigInteger(minusOne);
		System.out.println(minusBigOne);
		
		BigInteger ten1 = BigInteger.TEN;
		BigInteger ten2 = new BigInteger("10");
		BigInteger ten3 = new BigInteger("10");
		BigInteger ten4 = BigInteger.valueOf(10);
		BigInteger ten5 = BigInteger.valueOf(10);
		
		if(ten5 == ten4)
			System.out.println("wow");
	}
	public static int factorial(int n) {
		int result = 1;
		for(int i=1; i<=n; i++)
			result *= i;
		return result;
	}
	public static BigInteger factorialBI(int n) {
		BigInteger result = BigInteger.ONE;
		for(int i=1; i<=n; i++)
			result = result.multiply(BigInteger.valueOf(i));
		return result;
	}
	public static void immutabilityTest() {
		BigInteger two = new BigInteger("2");
		two.add(new BigInteger("3"));
		System.out.println(two);
	}
	public static void main(String[] args) {
	   	System.out.println("fact(10) = "+ factorialBI(10));
		System.out.println("fact(12) = "+ factorialBI(12));
		System.out.println("fact(13) = "+ factorialBI(13));
		System.out.println("fact(999) = "+ factorialBI(999));

		constructorTest();
		immutabilityTest();
		
		System.exit(0);
	}
}
