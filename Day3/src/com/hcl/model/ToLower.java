package com.hcl.model;

public class ToLower {
	private String str;
		
	public ToLower() {
	}
	
	public ToLower(String str) {
		this.str = str;
		System.out.println("The given string: " + this.str);
	}
	
	public String convertToLower() {
		return str.toLowerCase();
	}
}
