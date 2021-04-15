/**
 * Java program to have a super class and 2 sub-classes. 
 * And to display the details of the cardholder based on the input he selects
 */

package com.hcl.main;

import java.util.Scanner;

import com.hcl.model.MembershipCard;
import com.hcl.model.PaybackCard;
import com.hcl.model.UserCard;

public class UserCardMain {

	public static void main(String[] args) {
		int option;
		int rate;
		int points;
		double totalAmount;

		Scanner scanner;
		MembershipCard membershipCard;
		PaybackCard paybackCard;

		scanner = new Scanner(System.in);

		System.out.println("Enter name, cardNo, expiry date in the format: name|cardNo|expiry_date");
		String info = scanner.next();
		try {
			String[] strArray = info.split("\\|");

			System.out.println("Select a number:");
			System.out.println("1. Payback Card");
			System.out.println("2. Membership Card");

			option = scanner.nextInt();

			switch (option) {

			case 1:
				System.out.println("Enter the points and totalAmount");
				points = scanner.nextInt();
				totalAmount = scanner.nextInt();
				paybackCard = new PaybackCard(strArray[0], strArray[1], strArray[2], points, totalAmount);
				System.out.println(paybackCard.getHolderName() + "'s card details:");
				System.out.println("Card Number: " + paybackCard.getCardNo());
				System.out.println("Total amount: " + paybackCard.getTotalAmount());
				break;

			case 2:
				System.out.println("Enter the rate");
				rate = scanner.nextInt();
				membershipCard = new MembershipCard(strArray[0], strArray[1], strArray[2], rate);
				System.out.println(membershipCard.getHolderName() + "'s card details:");
				System.out.println("Card Number: " + membershipCard.getCardNo());
				System.out.println("Rate: " + membershipCard.getRate());
				break;

			default:
				System.out.println("Entered invalid number! Terminating program");
			}

		} finally {
			scanner.close();
			paybackCard = null;
			membershipCard = null;
		}

	}
}
