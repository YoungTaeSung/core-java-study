package core.ch03.array;

import java.util.Scanner;

public class RaggedArrayDemo {
	public static void main(String[] args) {
		int[][] raggedArray = null;
		
		System.out.print("Enter #Row: ");
		int row = new Scanner(System.in).nextInt();
		
		//Create Row First
		raggedArray = new int[row][];
		
		for(int i=0; i < raggedArray.length; i++) {
			raggedArray[i] = new int[i+1];
		}
		System.out.println("Constructed 2D RaggedArray");
		for(int i=0; i < raggedArray.length; i++) {
			for(int j=0; j < raggedArray[i].length; j++) {
				System.out.print((raggedArray[i][j]=i*j)+" ");
			}
			System.out.println();
		}
		System.exit(0);
	}
}
