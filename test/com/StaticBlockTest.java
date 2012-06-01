package com;

class StaticClass {
	public static int x = 3;
	public static int y;
	
	static {
		System.out.println("Static Block Initialized!");
		y = x * 10;
	}
	public static void showField() {
		System.out.println("x="+x);
		System.out.println("y="+y);
	}
}
public class StaticBlockTest {
	public static void main(String[] args) {
		StaticClass.showField();
		System.exit(0);
	}
}
