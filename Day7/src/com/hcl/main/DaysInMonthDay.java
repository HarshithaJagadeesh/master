/**
 * Java program to print the nyumber of days in a month taking in the year
 * and the month from the user
 */

package com.hcl.main;

import java.util.Scanner;
import com.hcl.model.DaysInMonth;

public class DaysInMonthDay {

	public static void main(String[] args) {
		
		int month;
		int year;
		
		DaysInMonth day;
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Enter the month and year of whose days have to be known");
		
		try {
			month = scanner.nextInt();
			year = scanner.nextInt();
			day = new DaysInMonth(year, month);
			
			System.out.println("The number of days in " + month + " of " + year + " is " + day.getDays());
		}catch(Exception exception) {
			System.err.println("Exception caught: " + exception);
		}
	}

}
