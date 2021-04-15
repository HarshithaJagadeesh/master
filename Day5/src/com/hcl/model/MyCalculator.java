package com.hcl.model;

import com.hcl.exception.CalException;

public abstract interface MyCalculator {
	
	public abstract int Calculation() throws CalException;

}
