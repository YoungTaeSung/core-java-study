package core.library.string;

public class StringBufferPerformance {
	private static final int OUT_COUNTER = 1000;
	private static final int INNER_COUNTER = 1000;

	public static void runWithString() {
		String strOut = "";
		for(int i=0; i<OUT_COUNTER; i++)
			for(int j=0; j<INNER_COUNTER; j++)
				strOut = strOut + (i+j);
		System.out.println(strOut);
	}
	public static void runWithStringBuffer() {
		StringBuffer strOut = new StringBuffer();
		for(int i=0; i<OUT_COUNTER; i++)
			for(int j=0; j<INNER_COUNTER; j++)
				strOut.append(i+j);
		System.out.println(strOut);
	}
	public static void main(String[] args) {
		runWithString();
		runWithStringBuffer();
		System.exit(0);
	}

}
