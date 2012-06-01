package corev.ch01.serialization;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.Date;
import java.util.GregorianCalendar;

class SerialCloneable implements Cloneable, Serializable {
	public Object clone() {
		try {
			ByteArrayOutputStream bout = new ByteArrayOutputStream();
			ObjectOutputStream out = new ObjectOutputStream(bout);
			out.writeObject(this);
			out.close();
			
			ByteArrayInputStream bin = new ByteArrayInputStream(bout.toByteArray());
			ObjectInputStream in = new ObjectInputStream(bin);
			Object ret = in.readObject();
			in.close();
			
			return ret;
		} catch (Exception e) { e.printStackTrace(); return null; }
	}
}
public class EmployeeSC extends SerialCloneable {
	private String name;
	private double salary;
	private Date hireDay;
	
	public EmployeeSC() {}
	public EmployeeSC(String iName, double iSalary, int year, int month, int day) {
		name = iName;
		salary = iSalary;
		GregorianCalendar calendar = new GregorianCalendar(year, month-1, day);
		hireDay = calendar.getTime();
	}
	public String getName() { return name; }
	public double getSalary() { return salary; }
	public Date getHireDay() { return hireDay; }
	
	public void raiseSalary(double byPercent) {
		double raise = salary * byPercent / 100;
		salary += raise;
	}
	@Override
	public String toString() {
		return getClass().getName()+"[Name="+name+", Salary="+salary+", HireDay="+hireDay+"]";
	}
}
