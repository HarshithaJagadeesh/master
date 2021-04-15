/**
 * Java program to replace all the 'd' occurrence characters with ‘h’ characters in each string
 */

package com.hcl.main;

import com.hcl.model.ReplaceLetters;

public class ReplaceMain {
	public static void main(String args[]) {
		ReplaceLetters replaceLetters = new ReplaceLetters(args[0]);
		
		System.out.println(replaceLetters.Replace());
		
		replaceLetters = null;
	}

}
