package com;
//No compile error!!
//But run-time error!!

public class BoxDemo2 {
	public static void main(String[] args) {
		Box integerBox = new Box();
		
		//correct: Object is generic!!
		integerBox.add("10");
		
		//wrong type casting!!
		Integer someInteger = (Integer)integerBox.get();
		System.out.println(someInteger);
		
		System.exit(0);
	}
}