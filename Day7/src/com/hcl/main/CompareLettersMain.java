/**
 * Java program to take a string from user and 
 * to check if the string has same letters at its first and last position
 * Print Valid if its same else print Invalid
 */

package com.hcl.main;

import java.util.Scanner;

import com.hcl.model.CompareFirstLastLetters;
import com.hcl.service.CheckLtters;

public class CompareLettersMain {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String myString;
		CompareFirstLastLetters firstLastLetters;
		CheckLtters checkLtters;
		System.out.println("Enter the string");
		try {
			myString = scanner.next();
			firstLastLetters = new CompareFirstLastLetters(myString);
			boolean isSame;
			checkLtters = new CheckLtters();
			isSame = checkLtters.CompareFirstLastLetter(firstLastLetters);
			if (isSame == true) {
				System.out.println("Valid");
			} else {
				System.out.println("Invalid");
			}

		} catch (Exception exception) {
			System.err.println("Exception caught: " + exception);
		} finally {
			scanner.close();
			checkLtters = null;
			firstLastLetters = null;
		}
	}

}
