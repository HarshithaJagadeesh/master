package com.model;

public class RunnalbleImpl implements Runnable {

	@Override
	public void run() {
		int count = 1;
		System.out.println("Running child thread in loop");

		while (count < 11) {
			System.out.println(count);
			count = count + 1;
			try {
			Thread.sleep(2000);
			}catch(Exception exception) {
				exception.printStackTrace();
			}
		}
	}

}
