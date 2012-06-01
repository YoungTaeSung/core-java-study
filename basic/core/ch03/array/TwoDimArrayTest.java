package core.ch03.array;

public class TwoDimArrayTest {
	public static void main(String[] args) {
		int[][] array = { {1,2}, {3, 4}, {5, 6} };
		System.out.println("Size of array: "+array.length);
		System.out.println("Size of array[0]: "+array[0].length);
		
		for(int i=0; i < array.length; i++) {
			for(int j=0; j < array[i].length; j++)
				System.out.print(array[i][j]+" ");
			System.out.println();
		}
		System.exit(0);
	}
}
