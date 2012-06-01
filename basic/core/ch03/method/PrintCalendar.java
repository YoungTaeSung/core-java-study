package core.ch03.method;

import javax.swing.JOptionPane;

public class PrintCalendar {
	public static void main(String[] args) {
		String yearStr = JOptionPane.showInputDialog("Enter Full Year(e.g. 2011)");
		int year = Integer.parseInt(yearStr);
		
		String monthStr = JOptionPane.showInputDialog("Enter Month in Number between 1 to 12:");
		int month = Integer.parseInt(monthStr);
		
		printMonth(year, month);
		
		System.exit(0);
	}
	static void printMonth(int year, int month) {
		printMonthTitle(year, month);
		printMonthBody(year, month);
	}
	static void printMonthTitle(int year, int month) {
		System.out.println("         "+getMonthName(month)+" "+year);
		System.out.println("-----------------------------");
		System.out.println(" Sun Mon Tue Wed Thu Fri Sat");
	}
	static String getMonthName(int month) {
		String monthName = null;
		switch(month) {
			case 1: monthName = "January"; break;
			case 2: monthName = "Feburary"; break;
			case 3: monthName = "March"; break;
			case 4: monthName = "April"; break;
			case 5: monthName = "May"; break;
			case 6: monthName = "June"; break;
			case 7: monthName = "July"; break;
			case 8: monthName = "August"; break;
			case 9: monthName = "September"; break;
			case 10: monthName = "October"; break;
			case 11: monthName = "November"; break;
			case 12: monthName = "December"; break;
		}
		return monthName;
	}
	static void printMonthBody(int year, int month) {
		int startDay = getStartDay(year, month);
		int numberOfDaysInMonth = getNumberOfDaysInMonth(year, month);
		
		for(int i=0; i < numberOfDaysInMonth; i++){
			if(i < 10)
				System.out.print("   "+i);
			else
				System.out.print("  "+i);
			
			if((i+startDay)%7 == 0)
				System.out.println();
		}
	}
	static int getStartDay(int year, int month) {
		 int total = 0;
		 // Get the total days from 1800 to year - 1
		 for (int i = 1800; i < year; i++)
			 if (isLeapYear(i))
				 total = total + 366;
			 else
				 total = total + 365;
		 
		 // Add days from January to the month prior to the calendar month
		 for (int i = 1; i < month; i++)
			 total = total + getNumberOfDaysInMonth(year, i);
		 return total;
	}
	static int getNumberOfDaysInMonth(int year, int month) {
		if (month == 1 || month == 3 || month == 5 || month == 7 ||
				month == 8 || month == 10 || month == 12)
			return 31;
		if (month == 4 || month == 6 || month == 9 || month == 11)
		        return 30;
		if (month == 2) return isLeapYear(year) ? 29 : 28;
		     return 0; // If month is incorrect
	}
	static boolean isLeapYear(int year) {
		return year % 400 == 0 || (year % 4 == 0 && year % 100 != 0);
	}
}