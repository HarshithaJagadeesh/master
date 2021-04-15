/**
 *Java program to read a number, 
 *calculate the sum of squares of even digits (values) present in the given number 
 */

package com.hcl.main;

import com.hcl.model.UserSumOfSquares;

public class SumOfSquaresMain {
	public static void main(String[] args) {
		
		UserSumOfSquares userSumOfSquares = new UserSumOfSquares();
		userSumOfSquares.setNumber(220);
		
		int sum=UserSumOfSquares.sumOfSquaresOfEvenDigits();
	    System.out.println("Sum of sqaures of even digits is " + sum);
	}

}
