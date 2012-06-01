package core.ch05.enumeration;

public class SeasonEnumTest {
	public static void checkSeason(SeasonEnum season) {
		String rt="";
		switch(season) {
		case SPRING: rt = "Warm"; break;
		case SUMMER: rt = "Hot"; break;
		case FALL: rt = "Cool";	break;
		case WINTER: rt = "Cold"; break;
		}
		System.out.println(rt);
	}
	public static void main(String[] args) {
		checkSeason(SeasonEnum.WINTER);
		checkSeason(SeasonEnum.SPRING);
		System.exit(0);
	}
}
