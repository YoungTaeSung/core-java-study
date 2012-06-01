package core.ch03.random;

import java.util.Random;

public class GenRandomTest {
	// v.01
	public static void genRandomTest() {
		System.out.println("genRandomTest01");
		for(int i=0; i < 10; i++) {
			System.out.print(10 + ((new Random()).nextInt(10))+" ");
		}
		System.out.println();
	}
	// v.02
	public static void genRandomTest(int startValue, int numOfValues) {
		System.out.println("genRandomTest02");
		for(int i=0; i < 10; i++) {
			System.out.print(startValue + ((new Random()).nextInt(numOfValues))+" ");
		}
		System.out.println();
	}
	// v.03
	public static void genRandomTest(int startValue, int diffValue, int numOfValues) {
		System.out.println("genRandomTest03");
		for(int i=0; i < 10; i++) {
			System.out.print(startValue + diffValue*((new Random()).nextInt(numOfValues))+" ");
		}
		System.out.println();
	}
	public static void main(String[] args) {
		genRandomTest();
		genRandomTest(1, 5);
		genRandomTest(1, 2, 5);
		System.exit(0);
	}
}
