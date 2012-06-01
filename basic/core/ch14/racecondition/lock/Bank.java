package core.ch14.racecondition.lock;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class Bank {
	private final double[] accounts;
	private Lock bankLock = new ReentrantLock();
	
	/*
	 * @param nAccounts: a number of accounts
	 * @param initBalance: initial balance for each account
	 */
	public Bank(int nAccounts, double initBalance) {
		accounts = new double[nAccounts];
		for(int i=0; i < accounts.length; i++)
			accounts[i] = initBalance;
	}
	/*
	 * Transfers money from one account to another.
	 * Use a lock to protect the transfer method.
	 */
	public void transfer(int from, int to, double amount) {
		if(accounts[from] < amount) return;  //there is no money to transfer

		bankLock.lock();
		try {
			System.out.print(Thread.currentThread());
			accounts[from] -= amount;
			System.out.printf(" %10.2f from %d to %d", amount, from, to);
			accounts[to] += amount;
			System.out.printf(" Total Balance: %10.2f%n", getTotalBalance());
		} finally {
			bankLock.unlock();
		}
	}
	/*
	 * Gets the sum of all account balances.
	 * @return the total balance.
	 */
	public double getTotalBalance() {
		double sum=0;
		for(double a : accounts)
			sum += a;
		return sum;
	}
	/*
	 * Gets the number of accounts in the bank.
	 * @return the number of accounts
	 */
	public int size() {
		return accounts.length;
	}
}
