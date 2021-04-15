package com.hcl.model;

public class MembershipCard extends UserCard {
	
	private int rate;

	public MembershipCard() {
		super();
	}

	public MembershipCard(String holderName, String cardNo, String expiryDate, int rate) {
		super();
		this.holderName = holderName;
		this.expiryDate = expiryDate;
		this.cardNo = cardNo;
		this.rate = rate;
	}

	public int getRate() {
		return rate;
	}
	
	

}
