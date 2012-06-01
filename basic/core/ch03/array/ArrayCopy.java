package core.ch03.array;

public class ArrayCopy {
	public static void main(String[] args) {
		int[] iArray = {10, 20, 30};
		int[] copyArray = {1, 2, 3, 4, 5};

		copyArray = iArray;
		
		for(int e : copyArray) {
			System.out.println(e);
		}
		
		copyArray[0] = -1;
		for(int e : iArray) {
			System.out.println(e);
		}
		System.exit(0);
	}
}
