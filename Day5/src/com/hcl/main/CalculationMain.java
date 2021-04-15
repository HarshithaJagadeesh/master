/**
 * Java program to take 2 input numbers from user and to calculate the power of the number
 * And to handle the exceptions if the numbers are negative and zero.
 * And to print different messages for different exception
 */

package com.hcl.main;

import java.util.Scanner;

import com.hcl.exception.CalException;
import com.hcl.model.MyCalculatorImpl;

public class CalculationMain {

	public static void main(String[] args) {

		int base;
		int index;

		Scanner scanner = new Scanner(System.in);
		MyCalculatorImpl myCalculatorImpl;

		System.out.println("Enter 2 positive numbers: Base, Index");
		base = scanner.nextInt();
		index = scanner.nextInt();

		try {
			int result = 0;
			myCalculatorImpl = new MyCalculatorImpl(base, index);
			result = myCalculatorImpl.Calculation();
			if (result != 0)
				System.out.println("The result is: " + result);
		} catch (CalException exObj) {
			System.out.println("Exception caught: " + exObj);
		} finally {
			scanner.close();
			myCalculatorImpl = null;
		}

	}

}
