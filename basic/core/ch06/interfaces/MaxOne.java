package core.ch06.interfaces;

public class MaxOne {
	public static Comparable comparableMax(Comparable obj1, Comparable obj2) {
		if(obj1.compareTo(obj2) < 0)
			return obj2;
		else
			return obj1;
	}
	public static Object objectMax(Object obj1, Object obj2) {
		if( ((Comparable)obj1).compareTo(obj2) < 0 )
			return obj2;
		else
			return obj1;
	}
}