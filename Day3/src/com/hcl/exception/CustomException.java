package com.hcl.exception;

public class CustomException extends Exception {
	private String msg;

	public CustomException(String msg) {
		super();
		this.msg = msg;
	}

	@Override
	public String getMessage() {
		return this.msg;
	}
	
	
	

}
