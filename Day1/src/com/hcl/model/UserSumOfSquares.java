package com.hcl.model;

public class UserSumOfSquares {

	private static int number, sum = 0;

	public void setNumber(int number) {
		UserSumOfSquares.number = number;
	}

	public static int sumOfSquaresOfEvenDigits() {
		while (number != 0) {
			int remainder = number % 10;
			if (remainder % 2 == 0) {
				sum += (remainder * remainder);
			}
			number = number / 10;
		}
		return sum;
	}
}
