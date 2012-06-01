package core.ch03.array;

public class ArrayAndMethod {
	public static void showArray(int[] array) {
		for(int e : array)
			System.out.print(e+" ");
		System.out.println();
	}
	public static void main(String[] args) {
		int[] ia = {1,2,3,4,5,6};
		showArray(ia);
		showArray(new int[]{10,20,30});
		System.exit(0);
	}
}
