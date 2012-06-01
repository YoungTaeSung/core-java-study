package core.adv.exception;

class ThrowsExpression {
	public static void doSleep() throws InterruptedException {
		Thread.sleep(2000);
	}
}
public class ExceptionDemo03 {
	public static void main(String[] args) throws InterruptedException {
		ThrowsExpression.doSleep();
		System.exit(0);
	}
}
