package problems.math.power;

/*
 * M�� N���� ���ϴ� �˰����� �ۼ��Ͻÿ�.
 * �ð����⵵�� logM�� �����ǵ��� �Ͻÿ�.
 * 
 * @Idea:
 * Case#1: power(3, 6) = 3 * 3 * 3 * 3 * 3 * 3 [size = 6]
 * 			           = 3^2 * 3^2 * 3^2 = power(3^2, 3) [size = 3]
 * 			           = 3^2 * power(3^2^2, 1) [size = 1]
 *                     = 
 * Case#2: 3^7 = 3 * power(3, 6)
 */
public class PowerTest {
	//O(N) time algorithm
	public static int powerWithNormal(int M, int N) {
		int result = 1;
		for(int i=0; i<N; i++)
			result *= M;
		return result;
	}
	//O(logN) time algorithm
	public static int powerWithImp(int M, int N) {
		if(N == 0) return 1;
		if(N == 1) return M;
		
		if(N%2==0) 
			return powerWithImp(M*M, N/2);
		else 
			return M * powerWithImp(M*M, N/2);
	}
	public static void main(String[] args) {
		System.out.println("> 2^6 = " + powerWithNormal(2, 0));
		System.out.println("> 2^6 = " + powerWithImp(2, 0));
		
		System.out.println("> 2^6 = " + powerWithNormal(2, 1));
		System.out.println("> 2^6 = " + powerWithImp(2, 1));
		
		System.out.println("> 2^6 = " + powerWithNormal(2, 5));
		System.out.println("> 2^6 = " + powerWithImp(2, 5));
		
		System.out.println("> 2^6 = " + powerWithNormal(2, 6));
		System.out.println("> 2^6 = " + powerWithImp(2, 6));
		
		System.exit(0);
	}
}
