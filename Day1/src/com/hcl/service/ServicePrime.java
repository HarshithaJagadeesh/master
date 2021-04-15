package com.hcl.service;

public class ServicePrime {

	public void isPrime(int number) {
		int flag = 0;

		if (number == 0 || number == 1) {
			System.out.println("Not a prime number");
		} else {
			for (int i = 2; i <= number / 2; i++) {
				if (number % i == 0) {
					flag = 1;
					break;
				}
			}
			if (flag == 1) {
				System.out.println("Not a prime number");
			} else {
				System.out.println("Is a prime number");
			}
		}
	}
}
