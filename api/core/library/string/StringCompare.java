package core.library.string;

public class StringCompare {
	public static void main(String[] args) {
		String str1 = "Hello, Java";
		String str2 = new String("Hello, Java");
		String str3 = str2.intern();
		
		//����� ������ �׽�Ʈ
		if(str1 == str2) {
			System.out.println("Same Reference!");
		} else {
			System.out.println("Different Reference!");
		}
		//equals() �޼��� �׽�Ʈ
		if(str1.equals(str2)) {
			System.out.println("Same Contents");
		} else {
			System.out.println("Different Contents");
		}
		
		//interned ��ü ��
		if(str1 == str3) {
			System.out.println("str1 and interned: Same ref");
		} else {
			System.out.println("str1 and interned: Diff ref");
		}
		if(str2 == str3) {
			System.out.println("str2 and interned: Same ref");
		} else {
			System.out.println("str2 and interned: Diff ref");
		}
		System.exit(0);
	}
}
