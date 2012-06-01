package core.ch03.array;

import java.util.Arrays;

public class ArrayCopyWithCopyOf {
	public static void main(String[] args) {
		int[] fromArray = {10, 20, 30, 40, 50};
		
		int[] toArray01 = Arrays.copyOf(fromArray, fromArray.length);
		System.out.println(Arrays.toString(toArray01));
		
		int[] toArray02 = Arrays.copyOf(fromArray, fromArray.length*2);
		System.out.println(Arrays.toString(toArray02));
		
		System.exit(0);
	}
}
