/**
 * Java progeram to cpunt the number of vowels

 */

package com.hcl.main;

import com.hcl.model.Vowels;

public class VowelMain {

	public static void main(String[] args) {
		Vowels vowels = new Vowels("hey this is");
		
		System.out.println(vowels.countVowels());

		vowels = null;
	}

}
