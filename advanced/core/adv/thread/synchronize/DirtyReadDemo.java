package core.adv.thread.synchronize;

import core.annotation.Comment;

@Comment()
class DirtyRead {
	private String firstName, lastName;
	
	@Comment("firstName ... some time sleeping ... lastName")
	public synchronized void setName(String _fname, String _lname) {
		printMessage("--Entering setName()--");
		firstName = _fname;
		
		if(firstName.length() < 5) {
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {}
		} else {
			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {}
		}
		lastName = _lname;
		printMessage("--Leaving setName(): FirstName="+firstName+", LastName="+lastName);
	}
	public String getFirstName() {
		return firstName;
	}
	public String getLastName() {
		return lastName;
	}

	private void printMessage(String msg) {
		String threadName = Thread.currentThread().getName();
		System.out.println(threadName+"# "+msg);
	}
}
public class DirtyReadDemo {
	public static void main(String[] args) {
		final DirtyRead dr = new DirtyRead();
		
		Runnable runA = new Runnable() {
			@Override
			public void run() {
				dr.setName("George", "Washington");
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
				/*
				 * ThreadA가 동기 메서드를 실행하고 있는 동안
				 * ThreadB는 아직 완료되지 않은 first/last Name의 값을 참조
				 */
				System.out.println("GetName(): "+ dr.getFirstName()+", "+dr.getLastName());
			}
		};
		Thread threadB = new Thread(runB, "Thread-B");
		threadB.start();
	}
}



















