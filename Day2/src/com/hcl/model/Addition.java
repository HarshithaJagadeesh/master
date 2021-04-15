package com.hcl.model;

public class Addition {
	private int number;
	private int sum;
	private String string;

	public Addition() {
		super();
		string ="";
	}

	public Addition(int number) {
		super();
		this.sum = 0;
		this.number = number;
	}

	public void setNumber(int number) {
		this.number = number;
	}

	public void setString(String string) {
		this.string = string;
	}

	public String getString() {
		return this.string;
	}
	
	public void calculateSum() {
		sum += this.number;
	}

	public void formString() {
		if (string == "") {
			string += this.number;
		} else {
			string = string + "+" + this.number;
		}
		calculateSum();
			System.out.println(string + "=" + this.sum);
	}
}