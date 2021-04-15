package com.hcl.model;

public class UserCard {
	protected String holderName;
	protected String cardNo;
	protected String expiryDate;
	
	public UserCard() {
		super();
	}

	public UserCard(String holderName, String cardNo, String expiryDate) {
		super();
		this.holderName = holderName;
		this.expiryDate = expiryDate;
		this.cardNo = cardNo;
	}

	public String getHolderName() {
		return holderName;
	}

	public String getExpiryDate() {
		return expiryDate;
	}

	public String getCardNo() {
		return cardNo;
	}
	
}
