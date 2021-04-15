/**
* Java program to read a string and a character, and reverse the string. 
* Convert it in a format such that each character is separated by the given character
*/

package com.hcl.main;

import java.util.Scanner;

import com.hcl.model.ReshapeImpl;

public class ReshapeMain {

	public static void main(String[] args) {
		
		String originalString;
		char specChar;
		Scanner scanner = new Scanner(System.in);
		ReshapeImpl reshapeImpl;
		
		try {
			String str;
			
			System.out.println("Enter the string");
			originalString = scanner.next();
			System.out.println("Enter a special character");
			str = scanner.next();
			specChar = str.charAt(0);
			
			reshapeImpl = new ReshapeImpl(originalString, specChar);
			str = reshapeImpl.Reshape();
			System.out.println("The String is      : " + reshapeImpl.getMyStr());
			System.out.println("The character is   : " + reshapeImpl.getSpecialChar());
			System.out.println("The final string is: " + reshapeImpl.getFinalString());
		}catch(Exception exception) {
			System.out.println("Exception: " + exception);
		}finally {
			scanner.close();;
			reshapeImpl = null;
		}
		
	}

}
