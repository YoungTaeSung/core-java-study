package core.adv.thread.interrupt;

public class PendingInterruptDemo {
	public static void main(String[] args) {
		if(args.length > 0) {
			Thread.currentThread().interrupt();
		}
		long startTime = System.currentTimeMillis();
		try {
			Thread.sleep(2000);
			System.out.println("was NOT interrupted!");
		} catch (InterruptedException e) {
			System.out.println("was interrupted!");
		}
		
		System.out.println("Elapsed Time="+(System.currentTimeMillis()-startTime));
	}
}
