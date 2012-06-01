package core.project;

import java.util.Arrays;

public class Grouping {
	public static void main(String[] args) {
		//Solution#1
		char[] charArray = {'a', 'c', 'A', 'Z', 'd', 'K', 'k', 'D'};
		Arrays.sort(charArray);
		System.out.println(charArray);
		
		for(int i = 0; i < charArray.length/2; i++) {
			char temp = charArray[i];
			charArray[i] = charArray[charArray.length - i - 1];         
			charArray[charArray.length - i - 1] = temp;     
		} 
		System.out.println(charArray);
		
		//Solution#2
		SingleChar[] scArray = new SingleChar[4];
		scArray[0] = new SingleChar('d');
		scArray[1] = new SingleChar('K');
		scArray[2] = new SingleChar('a');
		scArray[3] = new SingleChar('C');
		
		Arrays.sort(scArray);
		for(int k=0; k < scArray.length; k++)
			System.out.print(scArray[k]);
		
		System.exit(0);
	}
}
class SingleChar implements Comparable<SingleChar> {
	private char data;
	public SingleChar(char c) { data = c; }
	
	@Override
	public int compareTo(SingleChar other) {
		if(this.data < other.data) return -1;
		else if (this.data > other.data) return 1;
		else return 0;
	}
	public String toString() {
		return ""+data;
	}
}
