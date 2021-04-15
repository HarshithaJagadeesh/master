/**
 * Java program to print the maximum year, date and month of a default calendar
 */

package com.hcl.main;

import java.util.Calendar;

public class MaxValue {
	
	public static void main(String args[]) {
		
		Calendar calendar = Calendar.getInstance();
		
		System.out.println("The current time and date is " + calendar.getTime());
		
		System.out.println("The maximum of the year is: " + Calendar.getInstance().getActualMaximum(Calendar.YEAR));
		System.out.println("The maximumb of the month is: " + Calendar.getInstance().getActualMaximum(Calendar.MONTH));
		System.out.println("The maximum of the date is: " + Calendar.getInstance().getActualMaximum(Calendar.DATE));
	}

}
