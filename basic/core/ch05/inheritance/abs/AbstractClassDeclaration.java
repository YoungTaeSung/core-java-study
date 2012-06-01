package core.ch05.inheritance.abs;

abstract class Person {
	private String name;
	public Person() { name = "unknown"; }
	public String getName() { return name; }
	public abstract String getDescription();
	public void setName(String _name) { name=_name; }
}
class Student extends Person {
	private Integer id;
	public Student(String _name, Integer _id) {
		super();
		id=_id;
	}
	public int getID() { return id; }
	public void setID(Integer _id) { id=_id; }
	public String getDescription() {
		return "Student";
	}
}
public class AbstractClassDeclaration {
	public static void main(String[] args) {
		Person sam = new Student("Sam", 20110101);
		System.exit(0);
	}
}