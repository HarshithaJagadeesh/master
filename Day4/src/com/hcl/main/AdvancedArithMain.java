/**
 * Java program to get an integer from the user.
 * To add all the divisors of the number and display it.
 * The sum of divisor should be less than 1000
 */

package com.hcl.main;

import java.util.Scanner;

import com.hcl.model.AdvancedArithImpl;
import com.hcl.model.AdvancedArithmetic;
import com.hcl.service.AdvancedValidateNo;

public class AdvancedArithMain {

	public static void main(String[] args) {

		Scanner scanner;
		int number;
		AdvancedArithmetic advancedArithImpl;
		AdvancedValidateNo advancedValidateNo;

		scanner = new Scanner(System.in);
		try {
			boolean flag;

			System.out.println("Enter a number");
			number = scanner.nextInt();

			advancedArithImpl = new AdvancedArithImpl(number);
			number = advancedArithImpl.divisorSum();

			advancedValidateNo = new AdvancedValidateNo();
			flag = advancedValidateNo.validateNo(number);
			if (flag == true) {
				System.out.println("I implemented AdvancedArithmetic");
				System.out.println(number);
			}
		} catch (Exception e) {
			System.err.println("Exception caught " + e);
		} finally {
			scanner.close();
			advancedArithImpl = null;
		}
	}

}
