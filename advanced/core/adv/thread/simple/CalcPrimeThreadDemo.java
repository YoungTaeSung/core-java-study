package core.adv.thread.simple;

class CalcPrimeThread extends Thread {
	public static final int MAX_PRIMES = 10;
	public static final int TEN_SECONDS = 5000;
	public volatile boolean finished = false;
	
	@Override
	public void run() {
		int[] primes = new int[MAX_PRIMES];
		int count = 0;
		for(int i=2; i<MAX_PRIMES; i++) {
			if(finished) {
				break;
			}
			boolean prime = true;
			for(int j=0; j<count; j++) {
				if(i%primes[j]==0) {
					prime = false;
					break;
				}
			}
			if(prime) {
				primes[count++] = i;
				System.out.println("Found Prime: "+i);
			}
		}
	}
}
public class CalcPrimeThreadDemo {
	public static void main(String[] args) {
		CalcPrimeThread primeThread = new CalcPrimeThread();
		primeThread.start();
		try {
			Thread.sleep(primeThread.TEN_SECONDS);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		primeThread.finished = true;
		System.out.println(CalcPrimeThreadDemo.class.
							getSimpleName()+" Terminated!");
	}
}




