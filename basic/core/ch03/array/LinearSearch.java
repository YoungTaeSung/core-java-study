package core.ch03.array;

public class LinearSearch {
	public static int LinearSearch(int[] array, int key) {
		for(int i=0; i<array.length; i++)
			if(array[i] == key)
				return i;
		return -1;
	}
	public static void main(String[] args) {
		int result = LinearSearch(new int[] {10, 30, 5, -1}, 5);
		System.out.println("Result Index: "+result);
		
		System.exit(0);
	}
}
