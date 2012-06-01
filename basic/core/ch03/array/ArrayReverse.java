package core.ch03.array;

import java.util.Arrays;

public class ArrayReverse {
	public static void reverse01(int[] array) {
		for(int i=0; i<array.length/2; i++) {
			int temp = array[i];
			array[i] = array[array.length-1-i];
			array[array.length-1-i] = temp;
		}
	}
	public static void reverse02(int[] array) {
		for(int left=0, right=array.length-1; left < right; left++, right--) {
			int temp = array[left];
			array[left] = array[right];
			array[right] = temp;
		}
	}
	public static void reverse03(int[] array) {
		int left = 0;
		int right = array.length-1;
		while(left < right) {
			int temp = array[left];
			array[left] = array[right];
			array[right] = temp;
			left++;
			right--;
		}
	}
	public static void reverse04(int[] array) {
		int left = 0;
		int right = array.length-1;
		while(left < right) {
			swap(array, left++, right--);
		}
	}
	public static void swap(int[] array, int left, int right) {
		int temp = array[left];
		array[left] = array[right];
		array[right] = temp;
	}
	public static void main(String[] args) {
		int[] iArray = {20, 30, 0, 54, 77, 10};
		System.out.println("Before Reverse:"+Arrays.toString(iArray));
		reverse01(iArray);
		System.out.println("After Reverse01:"+Arrays.toString(iArray));
		reverse02(iArray);
		System.out.println("After Reverse02:"+Arrays.toString(iArray));
		reverse03(iArray);
		System.out.println("After Reverse03:"+Arrays.toString(iArray));
		reverse04(iArray);
		System.out.println("After Reverse04:"+Arrays.toString(iArray));
		
		System.exit(0);
	}
}
