/**
 * Java program to accept from the user 2 date string in the format dd/mm/yyyy and
 * to calculate the differnce between them in days. 
 */

package com.hcl.main;

import java.time.LocalDate;
import java.util.Scanner;

import com.hcl.model.DiffernceBetweenDates;
import com.hcl.service.DiffernceBetweenDatesService;

public class DiffernceBetweenDatesMain {

	public static void main(String[] args) {

		String date1;
		String date2;
		DiffernceBetweenDates differenceBetweenDates;
		
		Scanner scanner = new Scanner(System.in);

		try {
			long noOfDays;
			System.out.println("Enter date1 in the format YYYY-MM-dd");
			date1 = scanner.next();
			System.out.println("Enter the date2 in the format YYYY-MM-dd");
			date2 = scanner.next();

			differenceBetweenDates = new DiffernceBetweenDates(date1, date2);
			
			noOfDays = DiffernceBetweenDatesService.differenceDates(differenceBetweenDates);

			System.out.println(noOfDays);
		} catch (Exception exception) {
			exception.printStackTrace();
		} finally {
			scanner.close();
			differenceBetweenDates = null;
		}
	}

}
