/**
 * Java program to assign the current thread to t1, to change the name of
 * the thread to MyThread. Display the changed name of the thread. 
 * Also it should display the current time. 
 * Put the thread to sleep for 10 seconds and display the time again. 
 */

package com.main;

import java.text.SimpleDateFormat;
import java.util.Date;

public class MyThread extends Thread {

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

			Date date1 = new Date();
			SimpleDateFormat sdf1 = new SimpleDateFormat("kk:mm:ss");
			System.out.println("time : " + sdf.format(date1));
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

	}

}
