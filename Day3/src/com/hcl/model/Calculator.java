package com.hcl.model;

public class Calculator {
	private int number1;
	private int number2;
	
	public Calculator() {
		super();
	}

	public Calculator(int number1, int number2) {
		super();
		this.number1 = number1;
		this.number2 = number2;
	}

	public int add() {
		return (this.number1+this.number2);
	}

}
