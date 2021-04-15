package com.hcl.model;

public class LongestString {
	private String myString;
	private String longestString;

	public LongestString() {
		super();
	}

	public LongestString(String myString) {
		super();
		this.myString = myString;
		this.longestString = "";
	}

	public String getMyString() {
		return this.myString;
	}

	public void setLongestString(String longestString) {
		this.longestString = longestString;
	}

	public String getLongestString() {
		return longestString;
	}

}
