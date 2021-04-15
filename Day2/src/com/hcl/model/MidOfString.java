package com.hcl.model;

public class MidOfString {
	
	private String myString, midString;

	public MidOfString() {}

	public MidOfString(String myString) {
		super();
		this.myString = myString;
	}	

	public String getString() {
		return myString;
	}
	
	public void setMidString(String midString) {
		this.midString = midString;
	}
	
	public void display()
	{
		System.out.println("String is " + myString);
		System.out.println("Middle string is " + midString);
	}
}

