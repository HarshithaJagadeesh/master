package com.hcl.service;

import com.hcl.exception.PlayerException;

public class PlayerService {
	
	public PlayerService() {}
	
	public boolean validateAge(int age) throws PlayerException {
		if(age < 16) {
			throw new PlayerException("Invalid Age");
		}
		else {
			return  true;
		}
	}

}
