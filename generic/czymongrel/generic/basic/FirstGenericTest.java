package czymongrel.generic.basic;

/*
 * Notes
 * 1. What is "strong typed language"?
 */
import java.util.ArrayList;

class Person {
	public String mName = "Bob";
}
class Clock {
	public int mHour = 10;
}
public class FirstGenericTest {
	private static ArrayList mAList = new ArrayList();
	
	public static void main(String[] args) {
		mAList.add(new Person());
		mAList.add(new Clock());
		
		Object obj = mAList.get(0);
		if(obj.getClass() == Person.class) {
			Person tmpPerson = (Person)obj;
			System.out.println(tmpPerson.mName);
		}
		System.out.print("hello");
		System.exit(0);
	}
}
