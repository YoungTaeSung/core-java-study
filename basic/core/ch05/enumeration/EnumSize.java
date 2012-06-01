package core.ch05.enumeration;

public enum EnumSize {
	SMALL("S"), MEDIUM("M"), LARGE("L"), XLARGE("X");
	
	private String abbreviation;
	
	private EnumSize(String fieldValue) {
		this.abbreviation = fieldValue;
	}
	public String getAbbreviation() { return abbreviation; }
}
