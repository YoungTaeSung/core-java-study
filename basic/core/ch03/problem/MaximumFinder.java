package core.ch03.problem;

import java.util.Scanner;

public class MaximumFinder {
	public static double maximum(double x, double y, double z) {
		double maximumValue = x;
		if ( y > maximumValue )
			maximumValue = y;
		if ( z > maximumValue )
			maximumValue = z;
		return maximumValue;
	}
	public static double maximum2(double x, double y, double z) {
		return Math.max(x,	Math.max(y, z));
	}
	public static void main(String[] args) {
		Scanner input = new Scanner( System.in );
		System.out.print("세 수를 입력하세요: ");
		double number1 = input.nextDouble(); // read first double
		double number2 = input.nextDouble(); // read second double
		double number3 = input.nextDouble(); // read third double

		double result = maximum(number1, number2, number3 );
		System.out.println("최대값은 "+result+"입니다.");
		System.exit(0);
	}
}
