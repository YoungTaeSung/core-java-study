package core.ch05.inheritance.dbinding;

public class Liquid {
	private int amount;
	
	public Liquid() {}
	public void remove(int _amount) {
		if(amount >= _amount)
			amount -= _amount;
		else
			removeAll();
	}
	public void removeAll() {
		amount = 0;
	}
}
class Coffee {
	
}
