/**
 * Java program to search for an element of an integer array of 10 elements
 */

package com.hcl.main;

import java.util.Scanner;

import com.hcl.model.SearchNo;

public class SearchMain {

	public static void main(String[] args) {

		int number;
		int[] intArray = new int[10];
		Scanner scanner = new Scanner(System.in);

		System.out.println("Enter 10 array elements");
		for (int i = 0; i < 10; i++) {
			intArray[i] = scanner.nextInt();
		}

		System.out.println("Enter the number to be searched");
		number = scanner.nextInt();

		scanner.close();

		SearchNo searchNo = new SearchNo(intArray, number);

		System.out.println("The elements are");
		searchNo.display();

		boolean flag = searchNo.searchNo();

		searchNo.display(flag);
		
		searchNo = null;

	}

}
