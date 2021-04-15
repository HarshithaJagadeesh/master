package com.hcl.model;

public class LeastNum {
	private int num1, num2, num3, leastNo;

	public LeastNum() {
	}

	public LeastNum(int num1, int num2, int num3) {
		this.num1 = num1;
		this.num2 = num2;
		this.num3 = num3;
	}

	public void findLeastNo() {
		if (num1 < num2)

		{
			if (num1 < num3) {
				leastNo = num1;
			} else {
				leastNo = num3;
			}
		} else {
			if (num2 < num3) {
				leastNo = num2;
			} else {
				leastNo = num3;
			}
		}
	}
	
	public void display() {
		System.out.println("The least of " + this.num1 + " " + this.num2 + " " + this.num3 +  ":");
		System.out.println(leastNo);
	}
	
}
