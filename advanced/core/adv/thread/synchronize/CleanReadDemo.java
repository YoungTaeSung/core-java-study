package core.adv.thread.synchronize;

import core.annotation.Comment;

/*
 * Author(tester): YoungTaeSung
 * Ref: Java Thread Programming(Paul Hyde)
 * Date: 2011.12.16
 * Revision: 1
 */

@Comment("When threadA returns from setNames(), " +
			"it automatically releases the object-level lock. " +
			"Then threadB proceeds to acquire the object-level lock and enters " +
			"the getNames() method")
class CleanRead {
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
	@Comment("object-level-lock")
	public synchronized String getFirstName() {
		return firstName;
	}
	@Comment("object-level-lock")
	public synchronized String getLastName() {
		return lastName;
	}

	private void printMessage(String msg) {
		String threadName = Thread.currentThread().getName();
		System.out.println(threadName+"# "+msg);
	}
}
public class CleanReadDemo {
	public static void main(String[] args) {
		final CleanRead cr = new CleanRead();
		
		Runnable runA = new Runnable() {
			@Override
			public void run() {
				cr.setName("George", "Washington");
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
				System.out.println("GetName(): "+ 
									cr.getFirstName()+", "+
									cr.getLastName());
			}
		};
		Thread threadB = new Thread(runB, "Thread-B");
		threadB.start();
	}
}



















