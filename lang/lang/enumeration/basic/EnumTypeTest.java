package lang.enumeration.basic;

public class EnumTypeTest {
	enum Season { SPRING, SUMMER, FALL, WINTER }
	enum Size { SMALL, MEDIUM, LARGE, XLARGE, XXLARGE }
	
	public static void main(String[] args) {
		Season currentSeason = Season.SPRING;
		Season nextSeason = Season.SUMMER;
		Season prevSeason = Season.SPRING;
		
		if(currentSeason.equals(prevSeason))
			System.out.println("Same seasons-A");
		if(currentSeason == prevSeason)
			System.out.println("Same seasons-B");
		
		System.out.println(currentSeason);
		
		if(currentSeason != Season.WINTER)
			System.out.println("OK!");

		if(currentSeason == nextSeason)
			System.out.println("Same seasons!!");
		
		if(!currentSeason.equals(nextSeason))
			System.out.println("Same season2!!");
		
		System.exit(0);
	}
}
