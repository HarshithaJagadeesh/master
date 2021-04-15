package com.hcl.model;

public class PrintSubStr {
	
	private String str;
	private String subStr;
	
	public PrintSubStr() {
		super();
	}

	public PrintSubStr(String str) {
		super();
		this.str = str;
	}
	
	public void extractSubStr(int fromIndex, int toIndex) {
		
		subStr = str.substring(fromIndex, toIndex);	
	}
	
	public void display() {
		System.out.println("The string: " + str);
		System.out.println("The substring :" + subStr);
	}
	
	

}
