package com.hcl.main;

import java.util.Scanner;

import com.hcl.exception.CustomException;
import com.hcl.model.ModifyString;

public class ModifyStringMain {
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String str;
		ModifyString modifyString;
		
		try {
			System.out.println("Enter a string containing more than 2 characters");
			str = scanner.next();
			
			if(str.length()<3) {
				throw new CustomException("String doesn't satisfy the specifications");
			}
			modifyString = new ModifyString(str);
			String newString = modifyString.checkString();
			System.out.println("Modified string: " + newString);
			
			
		}catch(CustomException customException) {
			System.err.println("Exception caught: " + customException);
		}finally {
			scanner.close();
			modifyString = null;
		}
	}

}
