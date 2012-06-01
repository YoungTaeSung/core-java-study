package core.ch03.branch;

public class SwitchTest {
	public static void main(String[] args) {
		char condition = 'Z';
		switch(condition) {
		case 'A':
			System.out.println("A");
			break;
		case 'B':
			System.out.println("B");
			break;
		default:
			System.out.println("No match found!");
		}
		System.exit(0);
	}
}
