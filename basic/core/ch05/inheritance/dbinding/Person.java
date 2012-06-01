package core.ch05.inheritance.dbinding;

public class Person {
	public String toString() {
		return "Person";
	}
}
class Student extends Person {
	public String toString() {
		return "Person:Student";
	}
}
class Employee extends Person {
	public String toString() {
		return "Person:Employee";
	}
}
class CollegeStudent extends Student {
	public String toString() {
		return "Person:Student:CollegeStudent";
	}
}
