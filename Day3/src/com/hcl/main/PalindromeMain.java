/**
 * Java program to accept a string , print ‘Yes’ if it is a palindrome, print ‘No’ otherwise
 */

package com.hcl.main;

import java.util.Scanner;

import com.hcl.model.Palindrome;

public class PalindromeMain {

	public static void main(String[] args) {

		String str;
		boolean flag;
		Scanner scanner;
		Palindrome palindrome;

		try {
			System.out.println("Enter the string");
			scanner = new Scanner(System.in);
			str = scanner.next();

			palindrome = new Palindrome(str);

			flag = palindrome.isPalindrome();

			if (flag == true) {
				System.out.println("Palindrome");
			} else {
				System.out.println("Not Palindrome");

			}
		}

		finally {
			scanner = null;
			palindrome = null;
		}
	}

}