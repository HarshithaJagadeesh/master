/**
 * Java program to create a class implementing  Runnable interface. 
 *  In run() display a message "running child Thread in loop : " display the value of the counter ranging from 1 to 10. 
 * Within the loop put the thread to sleep for 2 seconds.
 *  In main create 3 objects of the DemoTread1 and execute the program. 
 * 
 */

package com.main;

import com.model.RunnalbleImpl;

public class RunnableImplMain {

	public static void main(String[] args) {
		RunnalbleImpl impl1 = new RunnalbleImpl();
		RunnalbleImpl impl2 = new RunnalbleImpl();
		RunnalbleImpl impl3 = new RunnalbleImpl();
		
		Thread thread = new Thread(impl1);
		
		thread.start();

	}

}
