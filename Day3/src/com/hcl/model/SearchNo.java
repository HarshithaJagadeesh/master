package com.hcl.model;

public class SearchNo {

	private int[] intArray;
	private int number;

	public SearchNo(int[] intArray, int number) {
		this.intArray = intArray;
		this.number = number;
	}

	public boolean searchNo() {
		for (int i = 0; i < intArray.length; i++) {
			if (intArray[i] == number) {
				return true;
			}
		}
		return false;
	}

	public void display() {
		for (int i = 0; i < intArray.length; i++) {
			System.out.println(intArray[i]);
		}
	}

	public void display(boolean flag) {
		if (flag == true) {
			System.out.println("The number is present");
		} else {
			System.out.println("The number is not present");
		}
	}

}
