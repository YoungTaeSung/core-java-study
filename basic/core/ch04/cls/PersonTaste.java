package core.ch04.cls;

public class PersonTaste {
	private final String genderType;
	private final int minAge;
	private final String subName;
	
	public PersonTaste() {
		genderType="Unknown"; minAge=0; subName="Unknown";
	}
	public PersonTaste(String gt, int ma, String sn) {
		genderType=gt; minAge=ma; subName=sn;
	}
	public String getTasteSubName() { return subName; }
	public int getTasteMinAge() { return minAge; }
	public String getTasteGenderType() { return genderType; }
	public String toString() {
		return "<Taste: GType="+genderType+", MinAge="+minAge+", SubName="+subName+">";
	}
}
