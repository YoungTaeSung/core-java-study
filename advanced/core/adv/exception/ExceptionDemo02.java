package core.adv.exception;

public class ExceptionDemo02 {
	/*
	 * precondition: N>0
	 * postcondition: (1+2+..+N)/N
	 */
	public static double averageN(int N) {
		int sum = 0;
		if(N <= 0) {
			System.out.println("ERROR avgN: N<=0, Program Terminating!");
			System.exit(0);
		}
		for(int i=1; i<=N; i++)
			sum += i;
		return sum/N;
	}
	public static void main(String[] args) {
		System.out.println("AVG(10):"+averageN(10));
		System.exit(0);
	}
}
