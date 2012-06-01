package core.ch03.array;

import java.util.Arrays;

public class ArraySortTest {
	public static void main(String[] args) {
		int[] iArray = {10, 3, -1, 59, 43, 21};
		char[] cArray = {'d', 'A', 'z', 'a', 'b', 'B'};
		String[] strArray = {"Hello", "My", "Name", "Is", "Tom"};
		
		Arrays.sort(iArray);
		System.out.println(Arrays.toString(iArray));
		
		Arrays.sort(cArray);
		System.out.println(Arrays.toString(cArray));
		
		Arrays.sort(strArray);
		System.out.println(Arrays.toString(strArray));
		
		System.exit(0);
	}

}
