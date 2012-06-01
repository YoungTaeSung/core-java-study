package com;

//type variable "Type"
//formal type parameter "Type"
public class BoxGeneric<Type> {
	private Type obj;
	
	public void add(Type other) {
		obj = other;
	}
	public Type get() {
		return obj;
	}
}
