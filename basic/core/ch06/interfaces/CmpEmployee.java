package core.ch06.interfaces;

import java.util.Date;
import java.util.GregorianCalendar;

public class CmpEmployee implements Comparable {
   private String name;
   private double salary;
   private Date hireDay;
   
   public CmpEmployee(String n, double s, int year, int month, int day) {
      name = n;
      salary = s;
      GregorianCalendar calendar = new GregorianCalendar(year, month - 1, day);
      hireDay = calendar.getTime();
   }
   public String getName() {
      return name;
   }
   public double getSalary() {
      return salary;
   }
   public Date getHireDay() {
      return hireDay;
   }
   public void raiseSalary(double byPercent) {
      double raise = salary * byPercent / 100;
      salary += raise;
   }
   @Override
   public int compareTo(Object obj) {
	   if(this.salary < ((CmpEmployee)obj).salary)
		   return -1;
	   else if(this.salary > ((CmpEmployee)obj).salary)
		   return 1;
	   else return 0;
   }
}