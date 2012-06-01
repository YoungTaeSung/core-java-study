package core.ch03;

public class StringDataType {
	public static void main(String[] args) {
		String message = "Welcome";
		message = "Welcome" + "to" + "Java World!";
		message = "Welcome" + " " + 2011;
		
		int x = 10, y = 20;
		
		System.out.println("X+Y="+x+y);
		System.out.println("X+Y="+(x+y));
		
		System.exit(0);
	}
}