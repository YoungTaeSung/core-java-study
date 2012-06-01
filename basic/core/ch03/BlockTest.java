package core.ch03;

public class BlockTest {
	public static void main(String[] args) {
		int outter_var = 10;
	
		{
			int inner_var = 20;
			System.out.println("outter_var="+outter_var);
		}
		//System.out.println("inner_var="+inner_var);
	}
}
