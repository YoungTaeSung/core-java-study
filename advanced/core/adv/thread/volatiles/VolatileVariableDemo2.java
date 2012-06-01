package core.adv.thread.volatiles;

import core.annotation.Comment;
import core.common.CoreUtils;

public class VolatileVariableDemo2 implements Runnable {
	@Comment("It should be marked as 'volatile'!")
	private int value;
	private volatile boolean missed;
	private long creationTime;
	
	public VolatileVariableDemo2() {
		value = 10;
		missed = false;
		creationTime = System.currentTimeMillis();
	}
	@Override
	public void run() {
		printMessage("Entering run().");
		while(value < 20) {
			if(missed) {
				printMessage("In run(): missed is true!");
				int currentValue = value;
				Object lockObj = new Object();
				synchronized (lockObj) {
					//do nothing
				}
				int afterValue = value;
				printMessage("In run(): currentValue = "+currentValue+", but rumor has it that is changed!");
				printMessage("In run(): afterValue = "+afterValue);
				break;
			}
		}
		printMessage("Leaving run(), value="+value+", missed="+missed);
	}
	public void doWork() throws InterruptedException {
		printMessage("Entering doWork()");
		printMessage("-- About to sleep 2sec.");
		Thread.sleep(2000);
		
		value = 50;
		printMessage("-- Just set value = "+value);
		printMessage("-- About to sleep 3sec.");
		Thread.sleep(3000);
		
		missed = true;
		printMessage("-- Just set missed = "+missed);
		printMessage("-- About to sleep 3sec.");
		Thread.sleep(3000);
		
		printMessage("Leaving doWork()");
	}
	private void printMessage(String msg) {
		long interval = System.currentTimeMillis() - creationTime;  
		
		String tmpStr = "    " + (interval/1000.0) + "000";  
		int pos = tmpStr.indexOf(".");  
		String secStr = tmpStr.substring(pos - 2, pos + 4); 
		
		String nameStr = "    " + Thread.currentThread().getName();  
		nameStr = nameStr.substring(nameStr.length() - 8, nameStr.length());
		
		System.out.println(secStr + " " + nameStr + ": " + msg);  
	}
	public static void main(String[] args) {
		try {
			VolatileVariableDemo2 vol = new VolatileVariableDemo2();
			Thread.sleep(100);
			
			Thread th = new Thread(vol, "Thread-Volatile");
			th.start();
			Thread.sleep(5000);
			
			vol.doWork();
		} catch (InterruptedException e) {
			CoreUtils.showMessage("One of the sleeps was INTERRUPTED!");
		} finally {
			CoreUtils.showMessage("Leaving main!");
		}
	}
}