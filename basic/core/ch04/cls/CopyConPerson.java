package core.ch04.cls;

public class CopyConPerson {
	private String name;
	private int age;
	private String gender;
	private String feeling;
	private PersonTaste taste;
	
	public CopyConPerson() {
		name="Unknown"; age=0; 
		gender="Male";
		feeling="Happy";
		taste = new PersonTaste();
	}
	public CopyConPerson(String mName, int mAge, String mGender, String tGender, int tAge, String tSubName) {
		name=mName; age=mAge;
		gender=mGender;
		feeling="Happy";
		taste = new PersonTaste(tGender, tAge, tSubName);
	}
	public CopyConPerson(CopyConPerson person) {
		this(person.name, person.age, person.gender, 
				person.taste.getTasteGenderType(), person.taste.getTasteMinAge(),
				person.taste.getTasteSubName());
	}
	public static CopyConPerson getInstance(CopyConPerson person) {
		return new CopyConPerson(person);
	}
	public void talkWith(CopyConPerson other) {
		int totalTasteCounter = 0;
		if(taste.getTasteGenderType().equals(other.taste.getTasteGenderType()))
			totalTasteCounter++;
		if(taste.getTasteMinAge() == other.taste.getTasteMinAge())
			totalTasteCounter++;
		if(taste.getTasteSubName().equals(other.taste.getTasteSubName()))
			totalTasteCounter++;
		if(totalTasteCounter < 2)
			feeling = "Sad";
		if("Hello".matches("lllo")) {
			System.out.println("Match");
		}
	}
	public void show() {
		System.out.println("["+name+", "+age+", "+gender+", "+feeling+"]");
	}
}
