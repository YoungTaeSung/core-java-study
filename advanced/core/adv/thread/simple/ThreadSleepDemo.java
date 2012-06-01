package core.adv.thread.simple;

class ThreadSleep extends Thread {
	@Override
	public void run() {
		loop();
	}
	public void loop() {  
		Thread t = Thread.currentThread();  
		String name = t.getName();  
	    System.out.println("just entered loop() - " + name);  
        for ( int i = 0; i < 10; i++ ) {  
        	try {
        		//currentThread¸¦ Áß´Ü½ÃÅ´!!
        		Thread.sleep(1000);  
            } catch ( InterruptedException x ) {  
            }  
        	System.out.println("name=" + name);  
        }
        System.out.println("about to leave loop() - " + name);  
     }
}
public class ThreadSleepDemo {	
	public static void main(String[] args) {  
         ThreadSleep tt = new ThreadSleep();  
         tt.setName("my worker thread");  
         tt.start();    
	 
//         try {  
//             Thread.sleep(700);  
//         } catch ( InterruptedException x ) {  
//	     }  
//         tt.loop();  
     }
}
