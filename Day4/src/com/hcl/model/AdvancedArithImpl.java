package com.hcl.model;

public class AdvancedArithImpl implements AdvancedArithmetic{
	private int number;
	
	public AdvancedArithImpl() {
		super();
	}

	public AdvancedArithImpl(int number) {
		super();
		this.number = number;
	}
	
	public int divisorSum() {
		int sum = 0;
		for(int i=1; i<=(number/2); i++) {
			if(this.number%i==0) {
				sum += i;
			}
		}
		
		return sum;
	}

}
