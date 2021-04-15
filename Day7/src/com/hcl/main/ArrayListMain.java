/**
 * Java program to read 5 elements to an ArrayList from the user.
 * To call a function to merge both the ArrayList and to sort them in an ascending order.
 * Then to add 2nd, 6th and the 8th element to a new ArrayList and to print them
 */

package com.hcl.main;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.hcl.model.ArrayListEx;
import com.hcl.service.ArrayListService;

public class ArrayListMain {

	public static void main(String[] args) {

		ArrayListEx arrayListex;
		ArrayListService arrayListService;
		Scanner scanner = new Scanner(System.in);

		List<Integer> list1 = new ArrayList<Integer>();
		List<Integer> list2 = new ArrayList<Integer>();
		try {
		System.out.println("Enter the 5 elemments for list1");
		for (int j = 0; j < 5; j++) {
			list1.add(scanner.nextInt());
		}
		
		System.out.println("Enter the 5 elemments for list2");
		for (int j = 0; j < 5; j++) {
			list2.add(scanner.nextInt());
		}
		
		arrayListex = new ArrayListEx(list1, list2);
		arrayListService = new ArrayListService();
		
		List<Integer> resultList = arrayListService.mergingSorting(arrayListex);
		
		System.out.println("The array after merging and sorting is:");
		for(Integer integer:resultList) {
			System.out.println(integer);
		}
		
		System.out.println("The elements at 2nd, 6ht and 8th index:");
		resultList = arrayListService.getAtCertainIndex(resultList);
		
		for(Integer integer:resultList) {
			System.out.println(integer);
		}
		
		}catch(Exception exception) {
			System.err.println("Exception caught: " + exception);
		}finally {
			scanner.close();
			arrayListex = null;
			arrayListService = null;
		}
		
		
	}
}
