package core.adv.exception;

public class ExceptionDemo01 {
	/*
	 * precondition: N>0
	 * postcondition: (1+2+..+N)/N
	 */
	public static double averageN(int N) {
		int sum = 0;
		for(int i=1; i<=N; i++)
			sum += i;
		return sum/N;
	}
	public static void main(String[] args) {
		System.out.println("AVG(10):"+averageN(0));
		System.exit(0);
	}
}
