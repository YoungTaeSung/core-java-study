package core.adv.thread.synchronize;

import core.annotation.Comment;

/*
 * TwoThreadBothInMethodDemo 코드에서
 * doSomething() --> synchronized 키워드 추가!
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
				 * 동기 메서드 내의 필드는 비동기적으로 사용가능한가?
				 * id 필드?
				 */
				System.out.println(ttbim.getId());
				/*
				 * doSomething() 메서드는 ThreadA가 lock을 해제해야만
				 * ThreadB가 호출 할 수 있다!
				 */
				ttbim.doSomething(7);
			}
		};
		Thread threadB = new Thread(runB, "Thread-B");
		threadB.start();	
	}
}
