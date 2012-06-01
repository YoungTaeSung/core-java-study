package com;

public class BoxGenericMethod<T> {
	private T obj;
	
	public void add(T other) { obj = other; }
	public T get() { return obj; }
	
	public<U> void inspect(U type) {
		System.out.println("T = "+obj.getClass().getName());
		System.out.println("U = "+type.getClass().getName());
	}
}
