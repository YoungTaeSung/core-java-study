package core.ch05.inheritance.object;

import java.util.ArrayList;
import java.util.Random;

public class GetClassTest {
	public static void main(String[] args) {
		Object[] objs = new Object[3];
		objs[0] = new String("String");
		objs[1] = new Random();
		objs[2] = new ArrayList<String>();
		
		for(Object o : objs) {
			System.out.println(o.getClass());
			System.out.println(o.getClass().getName());
		}
		
		System.exit(0);
	}
}
