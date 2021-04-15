/**
 * Java program to print date object in a specified format
 */

package com.hcl.main;

import java.text.SimpleDateFormat;
import java.time.format.DateTimeFormatter;
import java.util.Date;

public class DateSpecifiedFormat {

	public static void main(String[] args) {
		
		Date date = new Date();
		System.out.println("Date in default format: " + date);
		
		SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
		
		System.out.println("Date in specified format: " + dateFormat.format(date));
	}

}
