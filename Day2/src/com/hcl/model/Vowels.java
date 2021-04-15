package com.hcl.model;

public class Vowels {

	private int count;
	private String vowelList = "AEIOU";
	private String str;

	public Vowels(String str) {
		this.str = str;
	}

	public int countVowels() {
		str = str.toUpperCase();
		System.out.println(str);
		for (int i = 0; i < str.length(); i++) {
			for (int j = 0; j < vowelList.length(); j++) {

				if (str.charAt(i) == vowelList.charAt(j)) {
					count++;
				}

			}
		}
		return count;
	}
}
