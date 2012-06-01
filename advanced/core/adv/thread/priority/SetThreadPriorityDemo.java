package core.adv.thread.priority;

import core.annotation.Comment;
import core.common.CoreUtils;

@Comment("Test code for 'getPriority()' method")
class SetPriority {
	public static Runnable getRunnable() {
		Runnable r = new Runnable() {
			@Override
			public void run() {
				Thread thread = Thread.currentThread();
				for(int i=0; i<5; i++) {
					CoreUtils.showMessage("In run(): Priority="+thread.getPriority()+", " +
											"Name="+thread.getName());
					try {
						Thread.sleep(2000);
					} catch (InterruptedException e) {}
				}
			}			
		};
		return r;
	}
}
public class SetThreadPriorityDemo {
	public static void main(String[] args) {
		CoreUtils.showMessage("Entering main()");
		
		Thread threadA = new Thread(SetPriority.getRunnable(), "Thread-A");
		threadA.setPriority(8);
		threadA.start();
		
		Thread threadB = new Thread(SetPriority.getRunnable(), "Thread-B");
		threadB.setPriority(2);
		threadB.start();
	
		Runnable r = new Runnable() {
			@Override
			public void run() {
				/*
				 * threadC의 priority는 D로 부터 상속받음
				 */
				Thread threadC = new Thread(SetPriority.getRunnable(), "Thread-C");
				threadC.start();
			}
		};
		
		Thread threadD = new Thread(r, "Thread-D");
		threadD.setPriority(7);
		threadD.start();
		
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {}
		
		threadA.setPriority(3);
		CoreUtils.showMessage("In run(): "+threadA.getName()+", Priority="+threadA.getPriority());
		CoreUtils.showMessage("Leaving main()");
	}
}













