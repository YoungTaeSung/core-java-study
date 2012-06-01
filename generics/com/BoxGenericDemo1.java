package com;

//there is no type casting!!
public class BoxGenericDemo1 {
	public static void main(String[] args) {
		BoxGeneric<Integer> integerBox = new BoxGeneric<Integer>();
		integerBox.add(new Integer(10));
		Integer someInteger = integerBox.get();
		System.out.println(someInteger);
		
		//not allowed at compile time
		//integerBox.add("10");
		
		System.exit(0);
	}
}
