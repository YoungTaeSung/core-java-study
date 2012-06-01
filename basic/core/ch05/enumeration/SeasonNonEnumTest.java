package core.ch05.enumeration;

public class SeasonNonEnumTest {
	public static void checkSeason(int season) {
		String rt="";
		switch(season) {
		case SeasonNonEnum.SPRING:
			rt = "Warm";
			break;
		case SeasonNonEnum.SUMMER:
			rt = "Hot";
			break;
		case SeasonNonEnum.FALL:
			rt = "Cool";
			break;
		case SeasonNonEnum.WINTER:
			rt = "Cold";
			break;
		}
		System.out.println(rt);
	}
	public static void main(String[] args) {
		checkSeason(SeasonNonEnum.WINTER);
		checkSeason(SeasonNonEnum.SPRING);
		checkSeason(2);
		
		System.exit(0);
	}
}
