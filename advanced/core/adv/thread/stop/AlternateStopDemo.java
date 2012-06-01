package core.adv.thread.stop;

class AlternateStop implements Runnable {
	private boolean stopRequested;
	private Thread runThread;
	
	@Override
	public void run() {
		runThread = Thread.currentThread();
		stopRequested = false;
		int count=0;
		while(!stopRequested) {
			System.out.println("Running... count="+count);
			count++;
			
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				//Thread.currentThread().interrupt();
			}
		}
	}
	public void stopRequest() {
		stopRequested = true;
		if(runThread != null);
			//runThread.interrupt();
	}
}
public class AlternateStopDemo {
	public static void main(String[] args) {
		AlternateStop as = new AlternateStop();
		Thread th = new Thread(as, "AlternateStop");
		th.start();
		
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {}
		
		as.stopRequest();
	}
}
