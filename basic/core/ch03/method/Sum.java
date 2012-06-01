package core.ch03.method;

public class Sum {
	//메서드 정의
	public static int sum(int first, int second) {
		int result = first + second;
		return result;
	}
	//메서드 사용
	public static void main(String[] args) {
		int a = sum(10, 20);
		int b = sum(22, 1);
		
		System.out.println("A="+a+", B="+b);
		System.exit(0);
	}
}
