package com.hcl.model;

public class PaybackCard extends UserCard {
	
	private int pointsEarned;
	private double totalAmount;
	
	public PaybackCard() {
		super();
	}

	public PaybackCard(String holderName, String cardNo, String expiryDate, int pointsEarned, double totalAmount) {
		super();
		this.holderName = holderName;
		this.expiryDate = expiryDate;
		this.cardNo = cardNo;
		this.pointsEarned = pointsEarned;
		this.totalAmount = totalAmount;
	}

	public int getPointsEarned() {
		return pointsEarned;
	}

	public double getTotalAmount() {
		return totalAmount;
	}
	
	

}
