package core.ch14.racecondition;

public class TransferRunnable implements Runnable {
	private Bank bank;
	private int fromAccount;
	private double maxAmount;
	private int DELAY=10;
	
	/*
	 * Preparation for run() method 
	 */
	public TransferRunnable(Bank b, int from, double max) {
		bank = b;
		fromAccount = from;
		maxAmount = max;
	}
	public void run() {
		try {
			while(true) {
				int toAccount = (int)(bank.size()*Math.random());
				double amount = maxAmount * Math.random();
				bank.transfer(fromAccount, toAccount, amount);
				Thread.sleep(DELAY);
			}
		} catch(InterruptedException e) {}
	}
}
