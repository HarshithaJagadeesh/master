package com.hcl.model;

public class CheckInteger {
	private int num1;
	private int num2;
	
	public CheckInteger() {
		super();
	}

	public CheckInteger(int num1, int num2) {
		super();
		this.num1 = num1;
		this.num2 = num2;
	}

	public int Divide() {
		return this.num1/this.num2;
	}

}
