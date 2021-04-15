package com.hcl.model;

public class RunCalculation {
	
	private float totalRuns;
	private float runRate;
	private float over;
	
	public RunCalculation() {
		super();
	}

	public RunCalculation(float totalRuns, float over) {
		super();
		this.totalRuns = totalRuns;
		this.runRate = 0;
		this.over = over;
	}
	
	public float runRateCalculate() {
		if(over == 0) {
			throw new ArithmeticException();
		}
		runRate = totalRuns/over;
		return runRate;
	}
	
	

}
