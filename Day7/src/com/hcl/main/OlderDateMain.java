/**
 * Java program to take two dates from user in the form of dd-MM-YYYY
 * and to find out which date is older.
 * Then print the older date in the format YYYY-MM-dd
 * 
 */

package com.hcl.main;

import java.util.Scanner;

import com.hcl.model.OldDate;
import com.hcl.service.CompareDateService;

public class OlderDateMain {

	public static void main(String[] args) {
		
		String date1;
		String date2;
		String date;
		OldDate oldDate;
		CompareDateService compareDateService;
		
		Scanner scanner = new Scanner(System.in);
		
		try {
			System.out.println("Enter date1 in the format DD-MM-YYYY");
			date1 = scanner.next();
			System.out.println("Enter date2 in the format DD-MM-YYYY");
			date2 = scanner.next();
			
			oldDate = new OldDate(date1, date2);
			compareDateService = new CompareDateService();
			
			date = compareDateService.compareDates(oldDate);
			
			System.out.println("The older date is " + date);
			
		}catch (Exception e) {
			e.printStackTrace();
		}finally {
			scanner.close();
			oldDate = null;
			compareDateService = null;
		}

	}

}
