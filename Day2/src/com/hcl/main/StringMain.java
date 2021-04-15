/**
 * Java program to display the middle string if a string has odd no. of letters
 * And to display 2 middle letters if the string has even no. of letters
 */

package com.hcl.main;

import com.hcl.model.MidOfString;
import com.hcl.service.LocateMiddle;

public class StringMain {

	public static void main(String[] args) {
		MidOfString midOfString = new MidOfString("134");
		
		LocateMiddle locateObj = new LocateMiddle();
		
		locateObj.findMiddleLetter(midOfString);
		
		midOfString.display();
		
		midOfString = null;
		locateObj = null;
		
	}

}
