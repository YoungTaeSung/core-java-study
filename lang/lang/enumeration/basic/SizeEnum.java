package lang.enumeration.basic;

public enum SizeEnum {
	SMALL("S"), MEDIUM("M"), LARGE("L");
	
	//필드
	private String mAbbreviation;
	//생성자
	private SizeEnum(String abbreviation) {
		mAbbreviation = abbreviation;
	}
	//메서드
	public String getAbbreviation() { return mAbbreviation; }
	public void setAbbreviation(String abbreviation) { mAbbreviation = abbreviation; }
	
	@Override
	public String toString() {
		return super.toString() + ": Abbre. = " + mAbbreviation;
	}
	//final method's of Enum<SizeEnum>
	//can't override!!
//	@Override
//	public boolean equals(Object obj) {
//		return false;
//	}
}
