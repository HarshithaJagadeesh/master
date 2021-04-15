package com.hcl.exception;

public class PlayerException extends Exception {
	private String customMsg;

	public PlayerException(String customMsg) {
		super();
		this.customMsg = customMsg;
	}

	@Override
	public String getMessage() {
		return customMsg;
	}
	
	

}
