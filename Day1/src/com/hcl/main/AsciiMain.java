/**
 * Java program to print the ascii value of a given character
 */

package com.hcl.main;

import com.hcl.model.Ascii;

public class AsciiMain {
	
	public static void main (String[] args) {
		
	Ascii ascii = new Ascii();
	
	ascii.setCh(' ');
	
	ascii.display();
	
	ascii = null;
	
	}

}
