package core.ch03.problem;

import java.util.Scanner;

public class GCD {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int num1 = in.nextInt();
		int num2 = in.nextInt();
		
		int gcd = 1, k = 1;

		while (k <= num1 && k <= num2) {
		  if (num1 % k == 0 && num2 % k == 0)
		    gcd = k;
		  k++;
		}
		System.out.println("GCD of "+num1+" and "+num2+": "+gcd);
		System.exit(0);
	}
}
