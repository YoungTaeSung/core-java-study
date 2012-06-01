package core.inheritance;

public class Person {
	private int age;
	private String name;
	
	public Person() { age=0; name="NA"; }
	public Person(int iAge, String iName) { age=iAge; name=iName; }
	
	public void setAge(int nAge) { age=nAge; }
	public void setName(String nName) { name=nName; }
	public int getAge() { return age; }
	public String getName() { return name; }
}
