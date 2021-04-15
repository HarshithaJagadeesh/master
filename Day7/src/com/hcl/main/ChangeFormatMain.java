package com.hcl.main;

import java.util.Scanner;

import com.hcl.model.ChangeFormat;
import com.hcl.service.ChangeFormatService;

public class ChangeFormatMain {

	public static void main(String[] args) {

		String date;
		ChangeFormat changeFormat;
		Scanner scanner = new Scanner(System.in);

		System.out.println("Enter the date in the format dd/MM/YYYY");
		try {
			date = scanner.next();
			changeFormat = new ChangeFormat(date);
			date = ChangeFormatService.changeFormat(changeFormat);
			
			System.out.println(date);
			
		} catch (Exception exception) {
			exception.printStackTrace();
		}finally {
			scanner.close();
			changeFormat = null;
		}

	}

}
