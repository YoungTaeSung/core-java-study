package core.ch04.cls;

public class Person {
	private String name;
	private int age;
	
	public Person() { age = 0; name="Unknown"; }
	public Person(int initAge) { age = initAge; name="Unknown"; }
	public Person(int initAge, String initName) {
		age = initAge; name=initName;
	}
	public int getAge() { return age; }
	public void setAge(int newAge) { age = newAge; }
	
	public String getName() { return name; }
	public void setName(String nName) { name = nName; }
	
	public String toString() {
		return "Person["+name+", "+age+"]";
	}
}
