package core.ch05.inheritance.abs;

public class TransposeCipher extends CipherUtil {
	public String encode(String word) {
		StringBuffer result = new StringBuffer(word);
	    return result.reverse().toString();
	}
	public String decode(String word) {
		return encode(word);
	}
}
