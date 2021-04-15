package com.hcl.model;

public class ReshapeImpl implements ReshapeString {
	
	private String myStr;
	private char specialChar;
	private String finalString;
	
	public ReshapeImpl() {
		super();
	}

	public ReshapeImpl(String myStr, char specialChar) {
		super();
		this.myStr = myStr;
		this.specialChar = specialChar;
	}

	public String Reshape() {
		finalString = "";
		for(int i=myStr.length()-1; i>=0; i--) {
			finalString += myStr.charAt(i);
			finalString += specialChar;
		}
		return finalString;
	}

	public String getMyStr() {
		return myStr;
	}

	public char getSpecialChar() {
		return specialChar;
	}

	public String getFinalString() {
		return finalString;
	}

}
