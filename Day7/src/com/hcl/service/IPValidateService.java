package com.hcl.service;

import java.util.StringTokenizer;

import com.hcl.model.ValidateIPAddress;

public class IPValidateService {
	
	public boolean ValidateIP (ValidateIPAddress ipAddress) {
		
		boolean isValid = false;
		
		StringTokenizer t = new StringTokenizer(ipAddress.getIpAddress(), ".");
		int a = Integer.parseInt(t .nextToken());
		int b = Integer.parseInt(t.nextToken());
		int c = Integer.parseInt(t.nextToken());
		int d = Integer.parseInt(t.nextToken());
		if ((a >= 0 && a <= 255) && (b >= 0 && b <= 255) && (c >= 0 && c <= 255) && (d >= 0 && d <= 255))
			isValid = true;
		return isValid;
		
	}

}
