package core.adv.thread.synchronize;

import core.annotation.Comment;

/*
 * TwoThreadBothInMethodDemo �ڵ忡��
 * doSomething() --> synchronized Ű���� �߰�!
 */

@Comment("More than one thread is allowed to be " +
		 "inside a method at a time, " +
		 "each thread keeps a copy of its own local variables")
class OneThreadInMethod {
	private String id;
	public OneThreadInMethod(String _id) {
		id = _id;
	}
	public synchronized void doSomething(int value) {
		printMessage("Entering doSomething().");
		int number = value * 2 + id.length();
		printMessage("In doSomething(): local variable num = "+ number);
		
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {}
		printMessage("Leaving doSomething().");
	}
	
	public String getId() { return id; }
	
	private void printMessage(String msg) {
		String threadName = Thread.currentThread().getName();
		System.out.println(threadName+"# "+msg);
	}
}
public class OneThreadInMethodDemo {
	public static void main(String[] args) {
		final OneThreadInMethod ttbim = new OneThreadInMethod("Object");
		Runnable runA = new Runnable() {
			@Override
			public void run() {
				ttbim.doSomething(3);
			}
		};
		Thread threadA = new Thread(runA, "Thread-A");
		threadA.start();
		
		try {
			Thread.sleep(200);
		} catch (InterruptedException e) {}
		
		Runnable runB = new Runnable() {
			@Override
			public void run() {
				/*
				 * ���� �޼��� ���� �ʵ�� �񵿱������� ��밡���Ѱ�?
				 * id �ʵ�?
				 */
				System.out.println(ttbim.getId());
				/*
				 * doSomething() �޼���� ThreadA�� lock�� �����ؾ߸�
				 * ThreadB�� ȣ�� �� �� �ִ�!
				 */
				ttbim.doSomething(7);
			}
		};
		Thread threadB = new Thread(runB, "Thread-B");
		threadB.start();	
	}
}
