package core.ch06.interfaces;

import java.util.Arrays;

public class SortTest {
	public static void main(String[] args) {
		int[] intArray = {10, 20, 30, 1, 0};
		Arrays.sort(intArray);
		for(int i=0; i < intArray.length; i++) {
			System.out.print(intArray[i]);
			System.out.print(" ");
		}
		System.out.println();
		System.exit(0);
	}
}
