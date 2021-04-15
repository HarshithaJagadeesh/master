package com.hcl.model;

public class Swapping {
	
	private int num1;
	private int num2;

	public Swapping() {}

	public Swapping(int num1, int num2) {
		super();
		this.num1 = num1;
		this.num2 = num2;
	}

	public void swapNumbers() {
		int temp;
		temp = this.num1;
		this.num1 = this.num2;
		this.num2 = temp;
	}
	
	public void display()
	{
		System.out.println(num1 + " " + num2);	
	}

}

