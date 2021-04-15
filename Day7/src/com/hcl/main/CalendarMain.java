/**
 * Java program to print the current year, month and date default calendar
 */

package com.hcl.main;

import java.text.SimpleDateFormat;
import java.util.Calendar;

public class CalendarMain {
	
	public static void main(String[] args) {
	
		Calendar calendar = Calendar.getInstance();
		
		System.out.println("At present Calendar's Year: " + calendar.get(Calendar.YEAR));
		System.out.println("At present Calendar's Day: " + calendar.get(Calendar.DATE));
		System.out.println(new SimpleDateFormat("MMM").format(calendar.getTime()));
	}
}
