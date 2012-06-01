package core.adv.thread.priority;

import core.annotation.Comment;
import core.common.CoreUtils;

@Comment("Test code for 'getPriority()' method")
class GetPriority {
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
public class CurrentThreadPriorityDemo {
	public static void main(String[] args) {
		CoreUtils.showMessage("Entering main()");
		CoreUtils.showMessage("In main(): "+Thread.currentThread().getName()+
							", Priority = "+Thread.currentThread().getPriority());
		Thread thread = new Thread(GetPriority.getRunnable(), "GetPriority");
		thread.start();
		
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {}
		
		CoreUtils.showMessage("In main(): "+thread.getName()+
							", Priority = "+thread.getPriority());
		CoreUtils.showMessage("Leaving main()");
	}
}













