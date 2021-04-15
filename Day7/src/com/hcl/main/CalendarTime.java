/**
 * Java program to get year, month, week, date and time using default calendar
 */

package com.hcl.main;

import java.util.Date;

public class CalendarTime {

	public static void main(String[] args) {
		Date date=java.util.Calendar.getInstance().getTime();  
		System.out.println(date);

	}

}
