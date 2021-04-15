package com.hcl.model;

public class Ascii {
	
	private char ch;

	public void setCh(char ch) {
		this.ch = ch;
	}
	
	public void display() {
		System.out.println("The ascii value of " + this.ch + " is " + (int)ch);
	}
	

}
