/**
 * Java program to sort an integer array of 10 elements in ascending order
 */

package com.hcl.main;

import com.hcl.model.SortNo;

import java.util.Scanner;

public class SortMain {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		int[] intArray = new int[10];
		System.out.println("Enter 10 integers");
		for(int i=0; i <10; i++) {
			intArray[i] = scanner.nextInt();
		}
		
		scanner.close();
		
		SortNo sortNo = new SortNo(intArray);
		
		System.out.println("Array before sorting: ");
		sortNo.display();
		
		sortNo.ascendingOrder();
		
		System.out.println("Array after sorting: ");
		sortNo.display();
		
		sortNo = null;
		}
}

