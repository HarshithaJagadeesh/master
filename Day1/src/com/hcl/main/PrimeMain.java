/**
 *Java program, which will take a number variable and 
 * check whether the number is prime or not
 * 
 */

package com.hcl.main;

import com.hcl.model.PrimeNumber;
import com.hcl.service.ServicePrime;;

public class PrimeMain {

	public static void main(String[] args) {

		PrimeNumber primeNumber = new PrimeNumber(7);
		int number = primeNumber.getNumber();
		ServicePrime servicePrime = new ServicePrime();
		servicePrime.isPrime(number);
		
		primeNumber = null;

	}
}
