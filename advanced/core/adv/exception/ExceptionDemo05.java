package core.adv.exception;

class CalcAvg2 {
	public static double averageN(int N) {
		int sum = 0;
		if(N <= 0)
			throw new IllegalArgumentException("ERROR: N<=0");
		for(int i=1; i<=N; i++)
			sum += i;
		return sum/N;
	}
}
public class ExceptionDemo05 {
	public static void main(String[] args) {
		try {
			System.out.println("AVG(10):"+CalcAvg2.averageN(0));
		} catch (IllegalArgumentException e) {
			System.out.println(e.getMessage());
			e.printStackTrace();
		}
		System.exit(0);
	}
}
