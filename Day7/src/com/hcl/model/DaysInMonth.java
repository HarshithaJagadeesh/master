package com.hcl.model;

import java.time.YearMonth;

public class DaysInMonth {

	private int year;
	private int month;
	
	public DaysInMonth() {
		super();
	}

	public DaysInMonth(int year, int month) {
		this.year = year;
		this.month = month;
	}
	
	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}

	public int getMonth() {
		return month;
	}

	public void setMonth(int month) {
		this.month = month;
	}
	
	public int getDays(){
		YearMonth yearMonth = YearMonth.of(this.year, this.month);
		return yearMonth.lengthOfMonth();
	}
}
