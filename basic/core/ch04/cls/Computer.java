package core.ch04.cls;

/*
 * <code>Computer</code> is bla bla...
 * @author YoungTaeSung
 * @since 2011
 * @version 0.001
 */
public class Computer {
	private int max_runnable_program;
	private int current_running_program;
	private boolean is_power_on;
	private long powerOnTime, powerOffTime;
	
	public Computer() { max_runnable_program=1; is_power_on=false; }
	
	public Computer(int mProg) {
		max_runnable_program=mProg;
		is_power_on=false;
	}
	public void powerOn() { 
		if(is_power_on) {
			System.out.println("Computer is PowerOn State!");
			return;
		}
		is_power_on=true;
		powerOnTime = System.currentTimeMillis();
	}
	public void powerOff() {
		if(!is_power_on) {
			System.out.println("Computer is PowrOff State!");
			return;
		}
		is_power_on=false;
		powerOffTime = System.currentTimeMillis();
		release();
	}
	/*
	 * @deprecated will be removed
	 */
	public void execute(String prog, int runTime) {
		if(!is_power_on) {
			System.out.println("Computer is PowerOff State! ["+prog+":REJECT]");
			return;
		}
		if(current_running_program < max_runnable_program) {
			current_running_program++;
			System.out.println("Computer is PowerOn State! ["+prog+":ACCEPTED]");
			//Run Program!!
			try {
				Thread.sleep(runTime*1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		} else {
			System.out.println("Max #Program!");
			System.out.println("Computer is PowerOn State! ["+prog+":REJECT]");
		}
	}
	/*
	 * @return non
	 */
	public void execute(String prog) {
		this.execute(prog, 2);
	}
	private void release() {
		System.out.println("Total #executed program: "+current_running_program);
		System.out.println("Total exection time:"+(powerOffTime-powerOnTime)/1000.0+"sec");
		current_running_program=0;
	}
	public void show() {
		System.out.println("Computer[Power:"+(is_power_on?"ON":"OFF")+", MaxProg:"+max_runnable_program+"]");
	}
}
