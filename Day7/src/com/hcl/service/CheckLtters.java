package com.hcl.service;

import com.hcl.model.CompareFirstLastLetters;

public class CheckLtters {

	public boolean CompareFirstLastLetter(CompareFirstLastLetters compareObj) {
		boolean isSame = false;
		String string = compareObj.getMyString();

		if (string.charAt(0) == string.charAt(string.length() - 1)) {
			isSame = true;
		}

		return isSame;
	}
}
