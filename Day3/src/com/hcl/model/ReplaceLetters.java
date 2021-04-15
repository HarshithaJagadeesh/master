package com.hcl.model;

public class ReplaceLetters {

	private String str;
	private char[] arrChar;

	public ReplaceLetters() {
	}

	public ReplaceLetters(String str) {
		this.str = str;
	}

	public char[] Replace() {
		arrChar = str.toCharArray();
		for (int i = 0; i < arrChar.length; i++) {
			if (arrChar[i] == 'd') {
				arrChar[i] = 'h';
			}
		}
		return arrChar;
	}
}
