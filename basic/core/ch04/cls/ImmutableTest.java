package core.ch04.cls;

import java.util.Date;

public class ImmutableTest {
	public static void main(String[] args) {
		Immutable im = new Immutable();
		
		System.out.println("One="+im.getOne());
		System.out.println("Name="+im.getName());
		
		String tmpStr = im.getName();
		tmpStr = "Hello";
		System.out.println("Name="+im.getName());
		
		Immutable2 im2 = new Immutable2(1109128, 2011,1,1);
		System.out.println("ID="+im2.getId());
		BirthDate bd = im2.getBirthDate();
		bd.showBirthDate();
		
		bd.setDay(20);
		bd.showBirthDate();
		
		System.exit(0);
	}
}
