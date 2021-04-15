package com.hcl.model;

public class MultipleOfNo {

	private int flag3;
	private int flag5;
	private int flagBoth;
	
	public MultipleOfNo() {}

	public int checkMultiple(int num) {
		if (num % 3 == 0) {
			if (num % 5 == 0) {
				flagBoth = 1;
				return flagBoth;
			} else {
				flag3 = 3;
				return flag3;
			}
		} else if (num % 5 == 0) {
			flag5 = 5;
			return flag5;
		}
		return 0;
	}

	public void display(int number, int flag) {
		if (flag == 3) {
			System.out.println(number + " " + "FIZZ");
		} else if (flag == 5) {
			System.out.println(number + " " + "BUZZ");
		} else {
			System.out.println(number + " " + "FIZZ BUZZ");
		}

	}

}
