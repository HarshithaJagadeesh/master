package com.hcl.service;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

import com.hcl.model.DiffernceBetweenDates;

public class DiffernceBetweenDatesService {

	public static long differenceDates(DiffernceBetweenDates differenceBetweenDates) {
		
		LocalDate localDate1 = LocalDate.parse(differenceBetweenDates.getDate1());
		LocalDate localDate2 = LocalDate.parse(differenceBetweenDates.getDate2());
		
		long noOfDays = ChronoUnit.DAYS.between(localDate1, localDate2);
		
		return noOfDays;
	}
}
