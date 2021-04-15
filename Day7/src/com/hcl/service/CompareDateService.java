package com.hcl.service;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

import com.hcl.model.OldDate;

public class CompareDateService {
	
	public String compareDates(OldDate oldDate) {
		
		DateTimeFormatter format1 = DateTimeFormatter.ofPattern("dd-MM-yyyy");
		
		LocalDate date1 = LocalDate.parse(oldDate.getDate1(), format1);
		LocalDate date2 = LocalDate.parse(oldDate.getDate2(), format1);
		
		if(date1.isBefore(date2)) {
			
			return date2.format(DateTimeFormatter.ofPattern("yyyy-MM-dd"));
		}else {
			return date1.format(DateTimeFormatter.ofPattern("yyyy-MM-dd"));
		}
	}

}
