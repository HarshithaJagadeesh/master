/**
 * Java program that takes three numbers as input to calculate and 
 * print the average of the numbers
 */


package com.hcl.main;

import com.hcl.model.Average;

public class AverageMain {

	public static void main(String[] args) {

		Average average = new Average(10, 20, 35);

		System.out.println("Average is " + average.avg_Of_Numbers());
		
		average = null;

	}

}
