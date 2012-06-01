package core.adv.exception;

class CalcAvg {
	public static double averageN(int N) {
		int sum = 0;
		if(N <= 0)
			throw new IllegalArgumentException("ERROR: N<=0");
		for(int i=1; i<=N; i++)
			sum += i;
		return sum/N;
	}
}
public class ExceptionDemo04 {
	public static void main(String[] args) {
		System.out.println("AVG(10):"+CalcAvg.averageN(0));
		System.exit(0);
	}
}
