package com;

public class BoxDemo1 {
	public static void main(String[] args) {
		Box integerBox = new Box();
		
		integerBox.add(new Integer(10));
		Integer someInteger = (Integer)integerBox.get();
		
		System.out.println(someInteger);
		
		System.exit(0);
	}
}
