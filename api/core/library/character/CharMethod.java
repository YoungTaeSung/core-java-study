package core.library.character;

public class CharMethod {
	public static void main(String[] args) {
		Character chObject = new Character('b');
		
		//#1
		if(chObject.equals('b')) {
			System.out.println("1. char is 'b'");
		}
		if(chObject.equals(new Character('b'))) {
			System.out.println("2. char is equals to 'b'");
		}
		//#2
		System.out.println("3. "+chObject.compareTo('b'));
		System.out.println("4. "+chObject.compareTo('a'));
		System.out.println("5. "+chObject.compareTo('c'));
		//#3
		if(Character.isDigit(chObject)) {
			System.out.println("6. char is digit");
		}
		if(Character.isLetter(chObject)) {
			System.out.println("7. char is letter");
		}
		if(Character.isLowerCase(chObject)) {
			System.out.println("8. char is lowercase");
		}
		if(Character.isUpperCase(chObject)) {
			System.out.println("9. char is uppercase");
		}
		System.exit(0);
	}
}
