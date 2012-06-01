package kr.co.corejava.puzzler.expression;

public class Oddity {
	public static boolean oddity(int n) {
		return (n % 2) == 1;
	}
	public static void main(String[] args) {
		System.out.println(oddity(-4));
		System.exit(0);
	}
}
