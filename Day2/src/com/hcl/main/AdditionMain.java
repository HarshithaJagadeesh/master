package com.hcl.main;

import java.util.Scanner;

import com.hcl.model.Addition;;

public class AdditionMain {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		Addition addition = new Addition();
		System.out.println("Input numbers that are to be added. Give input as 0 when the addition has to get stopped");
		try {
			int num;
			while((num=scanner.nextInt())!=0) {
				addition.setNumber(num);
				addition.formString();
				
			}
			
		}catch(Exception exception) {
			System.err.println("Exceptions: " + exception);
		}finally {
			scanner.close();
			addition = null;
		}

	}

}
