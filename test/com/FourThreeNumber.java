package com;
import java.util.Random;

public class FourThreeNumber {
	private static int getNumber() {
		return new Random().nextInt(9) + 1;
	}
	public static void main(String[] args) {
		final int CORRECT = 3333;
		int[] array = new int[9];
		int[] tmpArray = new int[9];
		int result = 0;
		do {
			makeArray(array);
			result = sub(array);
			//System.out.println(result);
		} while(CORRECT != result);
		showResult(array);
		System.exit(0);
	}
	private static void showResult(int[] array) {
		System.out.println(array[0]+" "+array[1]+" "+array[2]+" "+array[3]+" "+array[4]);
		System.out.println("- "+array[5]+" "+array[6]+" "+array[7]+" "+array[8]); 
	}
	private static void makeArray(int[] array) {
		int counter = 0;
		initArray(array);
		int randNumber = 0;
		while(counter != 9) {
			randNumber = getNumber();
			if(!isDup(randNumber, array)) {
				array[counter++] = randNumber;
			}
		}
	 }
	 private static void initArray(int[] array) {
		 for(int i=0; i < array.length; i++) {
			 array[i] = 0;
		 }
	 }
	 private static boolean isDup(int randNumber, int[] array) {
		 for(int i=0; i < array.length; i++) {
			 if(array[i] == randNumber)
				 return true;
		 }
		 return false;
	 }
	 private static int sub(int[] array) {
		 int first = array[0]*10000 + array[1]*1000 + array[2]*100 + array[3]*10
		 + array[4]*1;
		 int second = array[5]*1000 + array[6]*100 + array[7]*10 + array[8]*1;
		 return first - second;
	 }
}