package core.ch05.inheritance.abs;

public class ChiperUtilTest {
	public static void main(String[] args) {
		CaesarCipher caesar = new CaesarCipher();
		
		String plain = "this is the secret message";
		String secret = caesar.encrypt(plain);
		System.out.println(" ********* Caesar Cipher Encryption *********");
		System.out.println("PlainText: " + plain);
		System.out.println("Encrypted: " + secret);
		System.out.println("Decrypted: " + caesar.decrypt(secret));

		TransposeCipher transpose = new TransposeCipher();
		secret = transpose.encrypt(plain);
		System.out.println("\n ********* Transpose Cipher Encryption *********");
		System.out.println("PlainText: " + plain);
		System.out.println("Encrypted: " + secret);
		System.out.println("Decrypted: " + transpose.decrypt(secret));
		System.exit(0);
	}
}
