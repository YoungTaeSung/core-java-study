package core.ch03.method.recursive;

public class RecursivePrint {
	public static void recursiveShow(String msg, int n) {
		if(n >= 1) {
			System.out.println(msg);
			recursiveShow(msg, n-1);
		}
	}
	public static void main(String[] args) {
		recursiveShow("Hello", 3);
		System.exit(0);
	}
}
