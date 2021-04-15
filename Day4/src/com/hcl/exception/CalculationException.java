package com.hcl.exception;

public class CalculationException extends Exception {
	
	private String customMsg;
	
	public CalculationException(String customMsg) {
		this.customMsg = customMsg;
	}

	@Override
	public String getMessage() {
		return customMsg;
	}

}
