/**
 * Java program accept a string, and two indices(integers),
 * print the substring consisting of all characters inclusive range from ..to 
 */

package com.hcl.main;

import java.util.Scanner;

import com.hcl.model.PrintSubStr;

public class SubStrMain {
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		String str;
		int fromIndex;
		int toIndex;
		
		System.out.println("Enter the string");
		str = scanner.next();
		
		System.out.println("Enter the begin and the end index");
		fromIndex = scanner.nextInt();
		toIndex = scanner.nextInt();
		
		scanner.close();
		
		PrintSubStr printSubStr = new PrintSubStr(str);
		
		printSubStr.extractSubStr(fromIndex, toIndex);

		printSubStr.display();
		
		printSubStr = null;
	}
}
