package com.hcl.service;

import com.hcl.exception.CalculationException;

public class AdvancedValidateNo {
	
	public boolean validateNo(int number) throws CalculationException {
		if(number<1000) {
			return true;
		}
		else {
			throw new CalculationException("The sum of divisor is more than 1000");
		}
	}

}
