package core.ch03;

public class SalesTax {
	public static void main(String[] args) {
		double purchaseAmount = 1197.1155;
		double tax = purchaseAmount * 0.06;
		System.out.println(tax);
		System.out.println(tax*100);
		System.out.println((int)(tax*100));
		System.out.println((int)(tax * 100)/100.0);
		System.exit(0);
	}
}