/**
 * Java program to find the least number and display it
 */

package com.hcl.main;

import com.hcl.model.LeastNum;

public class LeastNumMain {

	public static void main(String[] args) {
		LeastNum leastNum = new LeastNum(21, 3, 15);
		leastNum.findLeastNo();
		leastNum.display();
		
		leastNum = null;
	}

}
