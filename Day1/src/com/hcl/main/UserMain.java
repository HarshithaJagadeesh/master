/**
 * Java program to read a number and 
 * calculate the sum of odd digits (values) present in the given number
 */

package com.hcl.main;

import com.hcl.model.UserMainCode;

public class UserMain {

	public static void main(String[] args) {
		UserMainCode userMainCode = new UserMainCode();
		
		userMainCode.setNumber(1234);
		
		int retVal = UserMainCode.checkSum();
		
		if(retVal == 1) {
			System.out.println("The sum is odd");
		}
		else {
			System.out.println("The sum is even");
		}
		
		userMainCode = null;
	}
}
