package core.ch03.array;

public class ArrayReverseMethod {
	public static int[] reverse(int[] array) {
		int[] result = new int[array.length];
		for(int i=0, j=array.length-1; i < array.length; i++, j--) {
			result[j] = array[i];
		}
		return result;
	}
	public static void main(String[] args) {
		int[] ia = {10, 20, 30};
		int[] na = reverse(ia);
		
		for(int e : na)
			System.out.println(e+" ");
		System.exit(0);
	}
}
