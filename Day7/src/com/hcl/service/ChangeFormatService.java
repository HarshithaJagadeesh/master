package com.hcl.service;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

import com.hcl.model.ChangeFormat;

public class ChangeFormatService {
	
	public static String changeFormat(ChangeFormat changeFormat) {
		
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		
		LocalDate localDate = LocalDate.parse(changeFormat.getDateString(), formatter);
		
		return localDate.format(DateTimeFormatter.ofPattern("dd/MM/YYYY"));
		
	}

}