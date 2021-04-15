package com.hcl.service;

import com.hcl.model.MidOfString;

public class LocateMiddle {
	
	public void findMiddleLetter(MidOfString midObj) {
		String myStr = midObj.getString();
		
		int strLen = myStr.length();
		
		if(strLen%2==1) {
			String temp = myStr.substring(strLen/2 , strLen/2 +1);
			midObj.setMidString(temp);
		}
		else {
			String temp = myStr.substring(strLen/2-1, strLen/2 + 1);
			midObj.setMidString(temp);
		}
	}

}
