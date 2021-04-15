package com.hcl.model;

import com.hcl.exception.CalException;;
public class MyCalculatorImpl implements MyCalculator{

	private int num1;
	private int num2;
	
	public MyCalculatorImpl() {
		super();
	}

	public MyCalculatorImpl(int num1, int num2) {
		super();
		this.num1 = num1;
		this.num2 = num2;
	}

	public int getNum1() {
		return num1;
	}

	public void setNum1(int num1) {
		this.num1 = num1;
	}

	public int getNum2() {
		return num2;
	}

	public void setNum2(int num2) {
		this.num2 = num2;
	}

	public int Calculation() throws CalException {
		if(this.num1<0 || this.num2<0) {
			throw new CalException("Numbers can't be negative");
		}
		else if (this.num1==0 || this.num2 ==0){
			throw new CalException("Numbers can't be 0");
		}
		else{
			int result = 1;
			for(int i=0; i<num2; i++) {
				result*= num1;
			}
			return result;
		}
		
	}
}
