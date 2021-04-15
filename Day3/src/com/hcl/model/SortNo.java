package com.hcl.model;

public class SortNo {

	private int[] intArray;

	public SortNo(int[] intArray) {
		this.intArray = intArray;
	}

	public void display() {
		for (int i = 0; i < intArray.length; i++) {
			System.out.println(intArray[i]);
		}
	}

	public void ascendingOrder() {

		for (int i = 0; i < intArray.length; i++) {

			for (int j = i + 1; j < intArray.length; j++) {

				if (intArray[i] > intArray[j]) {
					int temp = intArray[j];
					intArray[j] = intArray[i];
					intArray[i] = temp;
				}
			}
		}
	}

}
