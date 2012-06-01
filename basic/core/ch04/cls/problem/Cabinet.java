package core.ch04.cls.problem;

public class Cabinet {
	private int cb_number;
	private boolean is_open;
	
	public Cabinet() { cb_number = 0; is_open = false; }
	public Cabinet(int cbNumber) {
		cb_number = cbNumber;
		is_open = false;
	}
	public int getCabNumber() { return cb_number; }
	public void setCabNumber(int cbNumber) { cb_number = cbNumber; }
	
	public boolean isOpen() { return is_open; }
	
	public void openCabinet() { is_open = true; }
	public void closeCabinet() { is_open = false; }
	
	public String toString() {
		return "Cab[n:" + cb_number + ", s:"+(is_open?"open":"close")+"]";
	}
	public void show() {
		System.out.println(this);
	}
}
