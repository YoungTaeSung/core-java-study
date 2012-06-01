package core.library.string;

public class StringBufferTest {
	public static void main(String[] args) {
		StringBuffer str_buffer = new StringBuffer();
		str_buffer.append("Hello");
		str_buffer.append(", Java!");
		str_buffer.append(" and Oracle!");
		System.out.println(str_buffer);
		
		str_buffer.delete(0, 2);
		System.out.println(str_buffer);
		
		str_buffer.replace(0, 4, "Hi");
		System.out.println(str_buffer);
		
		System.out.println(str_buffer.reverse());
		
		str_buffer.setCharAt(0, '#');
		System.out.println(str_buffer);
		
		StringBuffer str_buffer2 = new StringBuffer("My Name Is");
		System.out.println(str_buffer2);
		System.out.println(str_buffer2.capacity());
		str_buffer2.setLength(100);
		System.out.println(str_buffer2.capacity());
		
		System.exit(0);
	}
}
