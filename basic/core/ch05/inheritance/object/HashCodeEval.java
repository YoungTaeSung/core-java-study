package core.ch05.inheritance.object;

import java.util.Date;
import java.util.GregorianCalendar;

class CPU {
	private String brand;
	private int n_core;
	private Date manufact_date;
	
	public CPU(String _brand, int _nCore, int year, int month, int day) {
		brand = _brand;
		n_core = _nCore;
		manufact_date = new GregorianCalendar(year, month-1, day).getTime();
	}
	public boolean equals(Object obj) {
		if(this == obj) { return true; }
		if(obj == null) { return false; }
		if(this.getClass() != obj.getClass()) { return false; }
		CPU other = (CPU)obj;
		return brand.equals(other.brand) 
				&& n_core == other.n_core 
				&& manufact_date.equals(other);
	}
	@Override
	public int hashCode() {
		return 7*brand.hashCode() + 
			11*(new Integer(n_core).hashCode()) + 
			17*manufact_date.hashCode();
	}
}
public class HashCodeEval {
	public static void main(String[] args) {
		System.out.println(new CPU("Intel", 2, 2011, 10, 9).hashCode());
		CPU c1 = new CPU("Intel", 2, 2011, 10, 9);
		CPU c2 = new CPU("Intel", 2, 2011, 10, 9);
		if(c1.hashCode() != c2.hashCode()) {
			System.out.println("Something wrong!!");
		}
		System.exit(0);
	}
}
