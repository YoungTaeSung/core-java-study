package core.ch03.array;

import java.util.Arrays;
import java.util.Random;

public class CountAndFindRowCol {

	public static void main(String[] args) {
		int[][] array = initArrayRandom(5);
		showArray(array);
		System.exit(0);
	}
	public static void showArray(int[][] array) {
		for(int[] e : array) {
			System.out.println(Arrays.toString(e));
		}
	}
	public static int[][] initArrayRandom(int size) {
		int[][] array = new int[size][size];
		int[] arrayPool = new int[size*size];
		Random generator = new Random();
		
		//Initialize arrayPool with 0 to size*size-1
		for(int i=0; i<size*size; i++) {
			arrayPool[i] = i;
		}
		
		int lastIndex = arrayPool.length;
		int index = 0;
		for(int i=0; i<size; i++) {
			for(int j=0; j<size; j++) {
				System.out.println("LI="+lastIndex);
				index = (int)Math.random()*lastIndex;
				System.out.println("IND="+index);
				array[i][j] = arrayPool[index];
				arrayPool[index] = arrayPool[lastIndex-1];
				--lastIndex;
			}
		}
		return array;
	}
}
