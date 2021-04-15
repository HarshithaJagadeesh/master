/**
 * Java program to swap two variables
 */

package com.hcl.main;

import com.hcl.model.Swapping;

public class SwapMain {

	public static void main(String[] args) {
		
			Swapping swap = new Swapping(4,5);
			
			System.out.println ("Values before swapping:");
			swap.display();
			
			swap.swapNumbers();
			
			System.out.println ("Values after swapping:");
			swap.display();
		
			swap = null;
		}

}
