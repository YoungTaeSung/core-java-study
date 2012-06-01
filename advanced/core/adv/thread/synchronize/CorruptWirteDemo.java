package core.adv.thread.synchronize;

import core.annotation.Comment;

@Comment("two threads are simultaneously trying to make assignments \n"+
			"and their assignments might get interleaved")
class CorruptWrite 	{
	private String firstName, lastName;
	
	@Comment("firstName ... some time sleeping ... lastName")
	public void setName(String _fname, String _lname) {
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
	@Comment("real-world setName()")
//	public void setName(String _fName, String _lName) {
//		firstName = _fName; lastName = _lName;
//	}
	private void printMessage(String msg) {
		String threadName = Thread.currentThread().getName();
		System.out.println(threadName+"# "+msg);
	}
}
public class CorruptWirteDemo {
	public static void main(String[] args) {
		final CorruptWrite cw = new CorruptWrite();
		
		Runnable runA = new Runnable() {
			@Override
			public void run() {
				cw.setName("George", "Washington");
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
				cw.setName("Abe", "Lincoln");
			}
		};
		Thread threadB = new Thread(runB, "Thread-B");
		threadB.start();
	}
}



















