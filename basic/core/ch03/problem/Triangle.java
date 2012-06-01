package core.ch03.problem;

public class Triangle {
	public static void main(String[] args) {
		// Case1.
		//
		int numberOfStar  = 5;
		for(int i=0; i < numberOfStar; i++) {
			System.out.print("*");
		}
		System.out.println();
		// Case2.
		for(int i=0; i <= numberOfStar; i++) {
			for(int j=0; j < i; j++)
				System.out.print("*");
			System.out.println();
		}
		System.out.println();
		// Case3.
		for(int i=0; i <= numberOfStar; i++) {
			for(int j=numberOfStar-i; j > 0; j--)
				System.out.print("*");
			System.out.println();
		}
		System.out.println();
		// Case4.
		for(int i=0; i <= numberOfStar; i++) {
			for(int j=0; j < i; j++)
				System.out.print(" ");
			for(int k=numberOfStar-i; k > 0; k--)
				System.out.print("*");
			System.out.println();
		}
		System.out.println();
		// Case5.
		for(int i=0; i <= numberOfStar; i++) {
			for(int j=numberOfStar-i; j > 0; j--)
				System.out.print(" ");
			for(int k=0; k < i; k++)
				System.out.print("*");
			System.out.println();	
		}
		System.out.println();
		// Case6.
        //			  *
		//		     ***
		//		    *****
		//		   *******
		//		  *********
		for(int i=1; i <= numberOfStar; i++) {
			for(int j=numberOfStar-i; j > 0; j--)
				System.out.print(" ");
			for(int k=0; k < 2*i-1; k++)
				System.out.print("*");
			System.out.println();
		}
		System.out.println();
		// Case7.
        //	   **********
		//		*******
		//		 *****
		//		  ***
		//		   *	
		
		for(int i=0; i <= numberOfStar; i++) {
			for(int k=0; k < i; k++)
				System.out.print(" ");
			for(int j=0; j < (numberOfStar-i)*2-1; j++)
				System.out.print("*");
			System.out.println();
		}
	}
}
