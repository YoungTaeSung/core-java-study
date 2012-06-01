package core.collection.objects;

/*
 * @description Class Person
 * @description Concrete Å¬·¡½º
 */
public class Person {
	private String fName, lName;
	public Person() {}
	public Person(String fname, String lname) {
		fName = fname;
		lName = lname;
	}
	public String getfName() {
		return fName;
	}
	public void setfName(String fName) {
		this.fName = fName;
	}
	public String getlName() {
		return lName;
	}
	public void setlName(String lName) {
		this.lName = lName;
	}
	@Override
	public String toString() {
		return "Person [fName=" + fName + ", lName=" + lName + "]";
	}
}
