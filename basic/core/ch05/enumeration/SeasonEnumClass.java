package core.ch05.enumeration;

public class SeasonEnumClass {
	private int status;
	private SeasonEnumClass(int st) { status = st; }
	
	public final static SeasonEnumClass SPRING = new SeasonEnumClass(0);
	public final static SeasonEnumClass SUMMER = new SeasonEnumClass(1);
	public final static SeasonEnumClass FALL = new SeasonEnumClass(2);
	public final static SeasonEnumClass WINTER = new SeasonEnumClass(3);
}
