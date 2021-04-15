package com.hcl.service;

import com.hcl.model.LongestString;

public class LongestStringService {

	private String[] words;
	private static int count=0;

	public LongestStringService() {
		super();
	}

	public void tokeniseString(LongestString longestString) {
		String givenString = longestString.getMyString();
		String word = "";
		words = new String[40];
		int length = 0;

		givenString = givenString + " ";

		for (int i = 0; i < givenString.length(); i++) {
			if (givenString.charAt(i) != ' ') {
				word += givenString.charAt(i);
			} else {
				words[length] = word;
				word = "";
				length++;
				count++;
				
			}
		}
	}

	public String findLongestString() {
		String longestStr = words[0];
		
		for (int j = 1; j < count; j++) {
			System.out.println(j);
			
			if (words[j].length() > longestStr.length()) {
				longestStr = words[j];
			}
		}
		return longestStr;
	}
}
