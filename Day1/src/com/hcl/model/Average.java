package com.hcl.model;

public class Average {

	 private float num1;
	 private float num2;
	 private float num3;

	public Average() {
		super();
	}

	public Average(float num1, float num2, float num3) {
		super();
		this.num1 = num1;
		this.num2 = num2;
		this.num3 = num3;
	}

	public float avg_Of_Numbers() {
		float sum = num1 + num2 + num3;
		return (sum / 3);
	}

}
