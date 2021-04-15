package com.hcl.model;

public class UserMainCode {

	static int number;
	static int sum = 0;

	public UserMainCode() {
	}

	public void setNumber(int number) {
		UserMainCode.number = number;
	}

	public static int checkSum() {
		while (number != 0) {
			int remainder = number % 10;
			if (remainder % 2 == 1) {
				sum += remainder;
			}
			number = number / 10;
		}

		if (sum % 2 == 1) {
			return 1;
		} else {
			return -1;
		}

	}

}
