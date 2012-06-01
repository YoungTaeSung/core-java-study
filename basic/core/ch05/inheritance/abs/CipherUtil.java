package core.ch05.inheritance.abs;

import java.util.StringTokenizer;

public abstract class CipherUtil {
	public String encrypt(String msg) {
		StringBuffer buffer = new StringBuffer("");
		StringTokenizer words = new StringTokenizer(msg);
		while(words.hasMoreTokens()) {
			buffer.append(encode(words.nextToken())+" ");
		}
		return buffer.toString();
	}
	public String decrypt(String s) {
	    StringBuffer result = new StringBuffer("");   
	    StringTokenizer words = new StringTokenizer(s);  
	    while (words.hasMoreTokens()) {                  
	      result.append(decode(words.nextToken()) + " "); 
	    }
	    return result.toString();                         
	  }
	  public abstract String encode(String word);      
	  public abstract String decode(String word);
}
