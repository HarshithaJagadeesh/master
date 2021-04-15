/**
 * The error in the sample program was that the private member was being accessed using object
 * 
 */

package com.hcl.main;

import com.hcl.model.Sample_A;

public class SampleAMain {

	public static void main(String[] args) {

		Sample_A objA = new Sample_A();

		System.out.println("in main(): ");

		objA.setA(222);
		
		System.out.println("objA.a = " + objA.getA());

	}

}
