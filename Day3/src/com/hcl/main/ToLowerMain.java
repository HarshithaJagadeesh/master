/**
 * Java program to convert all the characters in a string to lowercase
 */

package com.hcl.main;

import com.hcl.model.ToLower;

public class ToLowerMain {
	public static void main(String args[]) {
		
		ToLower toLower = new ToLower(args[0]);
		System.out.println("The string after conversion: " + toLower.convertToLower());
		
		toLower = null;
	}

}
