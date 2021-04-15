/**
 * Java program to accept an user input IP Address and to validate it
 * Print valid if it is a valid Address else print Invalid.
 */

package com.hcl.main;

import java.util.Scanner;

import com.hcl.model.ValidateIPAddress;
import com.hcl.service.IPValidateService;

public class IPAddressMain {

	public static void main(String[] args) {
		
		String ipAddress;
		Scanner scanner = new Scanner(System.in);
		ValidateIPAddress address;
		IPValidateService ipValidateService;
		
		System.out.println("Enter an IP Address");
		try {
			
			boolean isTrue;
			ipAddress = scanner.nextLine();
			address = new ValidateIPAddress(ipAddress);
			
			ipValidateService = new IPValidateService();
			isTrue = ipValidateService.ValidateIP(address);
			
			if(isTrue) {
				System.out.println("Valid");
			}else {
				System.out.println("Invalid");
			}
		}catch (Exception e) {
			System.err.println(e);
		}finally {
			scanner.close();
		}
		

	}

}
