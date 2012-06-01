package core.adv.thread.priority;

import core.annotation.Comment;
import core.common.CoreUtils;

@Comment("")
class PriorityCompete {
	private int count;
	private boolean yield;
	private Thread internalThread;
	private boolean noStopRequested;
	
	public PriorityCompete(String name, int priority, boolean yield) {
		count = 0;
		this.yield = yield;
		noStopRequested = true;
		
		Runnable r = new Runnable() {
			@Override
			public void run() {
				try {
					runWork();
				} catch (Exception e) {
					e.printStackTrace();
				}
			}			
		};
		internalThread = new Thread(r, name);
		internalThread.setPriority(priority);
	}
	private void runWork() {
		Thread.yield();
		while(noStopRequested) {
			if(yield)
				Thread.yield();
			count++;
			for(int i=0; i<1000; i++){
				double x = i * Math.PI/Math.E;
			}
		}
	}
	public void startRequest() {
		internalThread.start();
	}
	public void stopRequest() {
		noStopRequested = false;
	}
	public int getCount() {
		return count;
	}
	public String getNameAndPriority() {
		return internalThread.getName()+": Priority="+internalThread.getPriority();
	}
	public static void runSet(boolean isYield) {
		PriorityCompete[] pc = new PriorityCompete[3];
		pc[0] = new PriorityCompete("PC0", 3, isYield);
		pc[1] = new PriorityCompete("PC1", 6, isYield);
		pc[2] = new PriorityCompete("PC2", 6, isYield);
		
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {}
		
		/*===========================*/
		for(int i=0; i<pc.length; i++) {
			pc[i].startRequest();
		}
		/*===========================*/
		
		long startTime = System.currentTimeMillis();
		try {
			Thread.sleep(10000);
		} catch (InterruptedException e) {}
		
		for(int i=0; i<pc.length; i++) {
			pc[i].stopRequest();
		}
		long stopTime = System.currentTimeMillis();
		
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {}
		
		int totalCount = 0;
		for(int i=0; i<pc.length; i++) {
			totalCount += pc[i].getCount();
		}
		CoreUtils.showMessage("TotalCount="+totalCount+", count/ms="+
						roundTo(((double)totalCount)/(stopTime-startTime), 3));
		for(int i=0; i<pc.length; i++) {
			double perc = roundTo(100.0 * pc[i].getCount()/totalCount, 2);
			CoreUtils.showMessage(pc[i].getNameAndPriority()+", "+perc+"%, count="+pc[i].getCount());
		}
	}
	private static double roundTo(double value, int places) {
		double factor = Math.pow(10, places);
		return (  (int)((value*factor)+0.5)  ) / factor;
	}
}
public class PriorityCompeteDemo {
	public static void main(String[] args) {
		Runnable r = new Runnable() {
			@Override
			public void run() {
				CoreUtils.showMessage("Run without using yield()");
				CoreUtils.showMessage("=========================");
				PriorityCompete.runSet(false);
				
				CoreUtils.showMessage("");
				CoreUtils.showMessage("Run using yield()");
				CoreUtils.showMessage("=========================");
				PriorityCompete.runSet(true);
			}
		};
		Thread thread = new Thread(r, "PriorityCompete");
		thread.setPriority(Thread.MAX_PRIORITY-1);
		thread.start();
	}
}



