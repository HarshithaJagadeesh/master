package com.hcl.main;

import java.io.BufferedReader;
import java.io.InputStreamReader;

import com.hcl.model.RunCalculation;

public class RunCalculatorMain {

	public static void main(String[] args) {
		
	    float total_runs;
		float overs;
		RunCalculation runCalculation;
		
		BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
		try {
		System.out.println("Enter the total runs");
		total_runs = Float.parseFloat(bufferedReader.readLine());
		
		System.out.println("Enter the no. of over");
		overs = Float.parseFloat(bufferedReader.readLine());
		
		runCalculation = new RunCalculation(total_runs, overs);
		float runRate = runCalculation.runRateCalculate();
		System.out.println("The run rate is: " + runRate);
		
		}catch(Exception exception) {
			System.out.println("Exception caught: " + exception);
		}
		finally {
			runCalculation = null;
		}
	}

}
