package core.ch03.random;

import java.util.Random;

public class RandomTest {
	public static void main(String[] args) {
		//Case1. { 0 <= x < 1.0 }
		double randomNumber = Math.random();
		System.out.println(randomNumber);
		
		Random generator = new Random();
		for(int i=0; i < 100; i++) {
			System.out.println(generator.nextInt());
		}
		System.exit(0);
	}
}
