package core.ch03.array;

import java.util.Arrays;

public class ArrayCopyByLoop {
	public static void main(String[] args) {
		int[] fromArray = {10, 20, 30, 40, 50};
		int[] toArray = new int[fromArray.length];
		
		for(int i=0; i < fromArray.length; i++)
			toArray[i] = fromArray[i];
		
		System.out.println(Arrays.toString(toArray));
		
		System.exit(0);
	}
}
