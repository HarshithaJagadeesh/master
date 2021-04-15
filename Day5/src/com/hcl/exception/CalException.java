package com.hcl.exception;

public class CalException extends Exception{
	private String myMsg;
	
	public CalException() {}
	
	public CalException (String myMsg) {
		this.myMsg = myMsg;
	}

	@Override
	public String getMessage() {
		return this.myMsg;
	}
	
	
	
	

}
