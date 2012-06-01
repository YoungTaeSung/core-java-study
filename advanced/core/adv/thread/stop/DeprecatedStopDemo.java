package core.adv.thread.stop;

class DeprecatedStop implements Runnable {
	@Override
	public void run() {
		int count=0;
		while(true) {
			System.out.println("Running: count="+count);
			count++;
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				System.out.println("Running: interrupted!");
			}
		}
	}
}
public class DeprecatedStopDemo {
	public static void main(String[] args) {
		DeprecatedStop ds = new DeprecatedStop();
		Thread t = new Thread(ds, "DeprecatedStop");
		t.start();
		
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {}
		
		t.stop();
	}
}
