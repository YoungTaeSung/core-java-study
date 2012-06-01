package core.ch03.array;

public class FirstArray {
	public static void main(String[] args) {
		int[] iArray = {10, 20, 30};
		int[] copyArray = iArray;
		
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
