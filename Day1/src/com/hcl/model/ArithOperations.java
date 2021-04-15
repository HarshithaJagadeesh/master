package com.hcl.model;

public class ArithOperations {

	private int num1;
	private int num2;

	public ArithOperations() {
		super();
	}

	public ArithOperations(int num1, int num2) {
		super();
		this.num1 = num1;
		this.num2 = num2;
	}

	public int sum() {
		return (this.num1 + this.num2);
	}

	public int difference() {
		return (this.num1 - this.num2);
	}

	public int mutliplication() {
		return (this.num1 * this.num2);
	}

	public int division() {
		if (this.num2 != 0) {
			return (this.num1 / this.num2);
		} else {
			return -1;
		}
	}

	public int remainder() {
		return (this.num1 % this.num2);
	}
}
