package core.adv.exception;

class LEToZeroException extends Exception {
	public LEToZeroException(String msg) {
		super(msg);
	}
}
class CalcAvg3 {
	public static double averageN(int N)throws LEToZeroException {
		int sum = 0;
		if(N <= 0)
			throw new LEToZeroException("ERROR: N<=0");
		for(int i=1; i<=N; i++)
			sum += i;
		return sum/N;
	}
}
public class ExceptionDemo06 {
	public static void main(String[] args) {
		try {
			System.out.println("AVG(10):"+CalcAvg3.averageN(0));
		} catch (LEToZeroException e) {
			System.out.println(e.getMessage());
			e.printStackTrace();
		}
		System.exit(0);
	}
}
