/**
 * Java program to demonstrate the use of a method Add which is in other package called com.hcl.model
 */

package com.hcl.main;

import java.util.Scanner;

import com.hcl.model.Calculator;

public class CalculatorMain {

	public static void main(String[] args) {
		
		int num1;
		int num2;
		
		Calculator calculator;
		Scanner scanner = new Scanner(System.in);
		
		try {
			int result;
			System.out.println("Enter two numbers");
			num1 = scanner.nextInt();
			num2 = scanner.nextInt();
			calculator = new Calculator(num1, num2);
			result = calculator.add();
			System.out.println("The sum is " + result);
		}catch(Exception exception) {
			System.out.println("Exception: " + exception);
		}finally {
			scanner.close();
			calculator = null;
		}

	}

}
