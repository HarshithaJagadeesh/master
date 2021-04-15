package com.hcl.model;

public class Palindrome {
	
	private String myString;

	public Palindrome() {
		super();
	}

	public Palindrome(String myString) {
		super();
		this.myString = myString;
	}
	
	public boolean isPalindrome() {
		boolean flag = false;
		for(int i=0; i<myString.length(); i++) {
			if(myString.charAt(i)==myString.charAt(myString.length()-1-i)) {
				flag = true;
			}
			else {
				flag = false;
			}
		}
		return flag;
	}
	
	

}
