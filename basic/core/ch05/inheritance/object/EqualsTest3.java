package core.ch05.inheritance.object;

class Student {
	private String name;
	private int id;
	public Student(String _name, int _id) { 
		name = _name; 
		id = _id;
	}
	@Override
	public boolean equals(Object other) {
		if(this == other) { return true; }
		if(other == null) { return false; }
		if(this.getClass() != other.getClass()) { return false; }
		 
		Student s = (Student)other;
		return name.equals(s.name) && (id == s.id);
	}
}
public class EqualsTest3 {
	public static void main(String[] args) {
		Student s1 = new Student("Sam", 2);
		Student s2 = new Student("Sam", 1);
		
		if(s1.equals(s2)) {
			System.out.println("equals() OK");
		} else {
			System.out.println("equals() NO");
		}
		System.exit(0);
	}
}
