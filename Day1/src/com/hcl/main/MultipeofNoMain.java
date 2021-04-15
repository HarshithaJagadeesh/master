/**
 * Java program which iterates the integers from 1 to 100.
 * For multiples of three print "Fizz" instead of the number and print "Buzz" for the multiples of five. 
 * When number is divided by both three and five, print "fizz buzz"
 */

package com.hcl.main;

import com.hcl.model.MultipleOfNo;

public class MultipeofNoMain {
	public static void main(String[] args) {

		MultipleOfNo multipleOfNo = new MultipleOfNo();
		
		for (int i = 1; i <= 100; i++) {
			int number;
			number = multipleOfNo.checkMultiple(i);
			
			if (number != 0)
				multipleOfNo.display(i, number);
		}
		
		multipleOfNo = null;
	}

}
