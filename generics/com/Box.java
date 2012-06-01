package com;

public class Box {
	private Object obj;
	
	public void add(Object other) {
		obj = other;
	}
	public Object get() {
		return obj;
	}
}
