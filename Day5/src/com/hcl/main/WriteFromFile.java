/**
 * Java program to read and direct the data to the system output from an already exisitng file
 * And to handle the exception if the file doesn't exist
 */

package com.hcl.main;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class WriteFromFile {
	
	public static void main(String[] args) {
		
	File file = new File("src//com//hcl//main//file.txt");
	
	try {
	
		BufferedReader bufferedReader = new BufferedReader(new FileReader(file));
		String myString;
		
		while((myString = bufferedReader.readLine())!=null){
			System.out.println(myString);
		}
		
		bufferedReader.close();
	
	}catch(FileNotFoundException exception) {
		exception.printStackTrace();		
	}catch (IOException exception) {
		exception.printStackTrace();
	}

	}
}

