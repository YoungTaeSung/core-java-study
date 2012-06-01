package corev.ch01.serialization;

import java.io.PrintWriter;
import java.io.Serializable;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Scanner;

public class Employee implements Serializable {
	private String name;
	private double salary;
	private Date hireDay;
	
	public Employee() {}
	public Employee(String iName, double iSalary, int year, int month, int day) {
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
