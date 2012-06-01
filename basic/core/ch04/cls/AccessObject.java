package core.ch04.cls;

public class AccessObject {
	public static void main(String[] args) {
		AccessCircle c1 = new AccessCircle(5.0);
		
		double tmpRadius = c1.radius;
		double tmpArea = c1.getArea();
		
		System.out.println(tmpRadius);
		System.out.println(tmpArea);
				
		c1.radius = 20.0;
		tmpArea = c1.getArea();
		
		System.out.println(tmpArea);	
		System.exit(0);
	}
}
