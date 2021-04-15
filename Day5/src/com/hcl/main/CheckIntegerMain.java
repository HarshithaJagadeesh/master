package com.hcl.main;

import java.util.Scanner;

import com.hcl.model.CheckInteger;

public class CheckIntegerMain {

	public static void main(String[] args) {
		int number1;
		int number2;

		Scanner scanner;
		scanner = new Scanner(System.in);
		CheckInteger checkInteger;

		try {
			System.out.println("Enter the number1 and number2");
			number1 = scanner.nextInt();
			number2 = scanner.nextInt();

			checkInteger = new CheckInteger(number1, number2);

			int qoutient = checkInteger.Divide();

			System.out.println("The qoutient is " + qoutient);
		} catch (Exception exception) {
			System.out.println("Exception caught: " + exception);
		}finally {
			scanner.close();
		}

	}

}
