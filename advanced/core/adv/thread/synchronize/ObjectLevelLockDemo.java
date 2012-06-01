package core.adv.thread.synchronize;

import core.annotation.Comment;

@Comment("Every instance of a class has its own object-level lock!")
class ObjectLevelLock {
	private String id;
	public ObjectLevelLock(String _id) {
		id = _id;
	}
	@Comment("keyword synchronized")
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
public class ObjectLevelLockDemo {
	public static void main(String[] args) {
		/*
		 * objectA�� objectB�� ���� �ٸ� ��ü
		 * ���� object-level-lock�� ������.
		 * synchronized doSomething() �޼����
		 * ������� ���� �� �� �ִ�.
		 */
		final ObjectLevelLock objectA = new ObjectLevelLock("Object1");
		final ObjectLevelLock objectB = new ObjectLevelLock("Object2");
		
		Runnable runA = new Runnable() {
			@Override
			public void run() {
				objectA.doSomething(3);
			}
		};
		Thread threadA = new Thread(runA, "Thread-A");
		threadA.start();
		
		try {
			Thread.sleep(100);
		} catch (InterruptedException e) {}
		
		Runnable runB = new Runnable() {
			@Override
			public void run() {
				objectB.doSomething(7);
			}
		};
		Thread threadB = new Thread(runB, "Thread-B");
		threadB.start();	
	}
}