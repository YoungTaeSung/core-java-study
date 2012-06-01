package com;

public class BoxGenericMethodDemo {
	public static void main(String[] args) {
		BoxGenericMethod<Integer> integerBox = 
			new BoxGenericMethod<Integer>();
		
		integerBox.add(new Integer(10));
		integerBox.inspect("Hello");
		
		System.exit(0);
	}
}
