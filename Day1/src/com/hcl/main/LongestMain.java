package com.hcl.main;

import java.util.Scanner;

import com.hcl.model.LongestString;
import com.hcl.service.LongestStringService;

public class LongestMain {

	public static void main(String[] args) {

		String myString;
		myString = args[0];

		LongestString longestString = new LongestString(myString);
		LongestStringService longestStringService = new LongestStringService();

	
		longestStringService.tokeniseString(longestString);
		String str = longestStringService.findLongestString();
		
		longestString.setLongestString(str);
		
		System.out.println("The longest string: " + longestString.getLongestString());

		longestString = null;
		longestStringService = null;
	}
}
