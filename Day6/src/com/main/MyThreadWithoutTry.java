/**
 * Java program to remove the try{}catch(){} block surrounding the sleep method and try to execute the code.
 */

package com.main;

import java.text.SimpleDateFormat;
import java.util.Date;

public class MyThreadWithoutTry {

	public static void main(String[] args) {
		MyThread t1 = new MyThread();
		System.out.println("Name of thread of t1: " + t1.getName());

		t1.start();

		t1.setName("MyThread");
		System.out.println("Name after changing: " + t1.getName());

		Date date = new Date();
		SimpleDateFormat sdf = new SimpleDateFormat("kk:mm:ss");
		System.out.println("time1 : " + sdf.format(date));
		try {
			Thread.sleep(10000);
		}catch(Exception exception) {
			exception.printStackTrace();
		}
			// We get an error as there has to exception handling for InterruptedException
			
			Date date1 = new Date();
			SimpleDateFormat sdf1 = new SimpleDateFormat("kk:mm:ss");
			System.out.println("time : " + sdf.format(date1));


	}

}
