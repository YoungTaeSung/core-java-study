package core.adv.thread.interrupt;

class PIInterrupt implements Runnable {
	//PI 근사값
	private double latestPIEstimate;
	
	@Override
	public void run() {
		try {
			//Math.PI의 값과 비교하기 위해 출력
			System.out.println("For comparison, Math.PI=" +   
			                              Math.PI);
			//정확도(오차범위 설정)
			calcPI(0.000000001);  
			System.out.println("Within accuracy, latest pi=" +   
			                                latestPIEstimate);
		} catch ( InterruptedException x ) {  
		    System.out.println("INTERRUPTED!! latest PI=" +   
			                                 latestPIEstimate);  
	    } 
	}
	private void calcPI(double accuracy)   
					throws InterruptedException {  
		latestPIEstimate = 0.0;  
		long iteration = 0;  
		int sign = -1;  
		
		while (Math.abs(latestPIEstimate - Math.PI) >   
											accuracy ) {  
			if (Thread.interrupted()) {  
				throw new InterruptedException();  
			}
			iteration++;  
			sign = -sign;  
			latestPIEstimate +=
					sign * 4.0 / ( ( 2 * iteration ) - 1 );  
		}  
	}
}
public class PIInterruptDemo {
	public static void main(String[] args) {
		PIInterrupt pi = new PIInterrupt();  
		Thread t = new Thread(pi);  
		t.start();  
		
		try {
			Thread.sleep(10000);  
			t.interrupt();  
		 } catch ( InterruptedException x ) {}
	}
}