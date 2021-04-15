/**
 * Java program to print the sum (addition), multiply,
 * subtract, divide and remainder of two numbers.
 */

package com.hcl.main;

import com.hcl.model.ArithOperations;

public class ArithMain {

	public static void main(String[] args) {
		ArithOperations arithOperations = new ArithOperations(20, 6);

		System.out.println("The sum is " + arithOperations.sum());
		System.out.println("The difference is " + arithOperations.difference());
		System.out.println("The product is " + arithOperations.mutliplication());

		int num = arithOperations.division();

		if (num == -1) {
			System.out.println("Denominator is 0. Division not possible");
		} else {
			System.out.println("The qoutient is " + arithOperations.division());
		}

		System.out.println("The remainder is " + arithOperations.remainder());
		
		arithOperations = null;

	}

}
