/**
 * Java program to accept a date string from user in the form of dd/MM/YYYY
 * and to convert it into a date object and print it 
 */

package com.hcl.main;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class StringtoDate {

	public static void main(String[] args) {
		
		String stringDate = "30/12/2020";
		try {
			Date date = new SimpleDateFormat("dd/MM/yyyy").parse(stringDate);
			System.out.println("The given date string:  " + stringDate);
			System.out.println("The date after parsing: " + date);
		} catch (ParseException e) {
			e.printStackTrace();
		}
	}
}
