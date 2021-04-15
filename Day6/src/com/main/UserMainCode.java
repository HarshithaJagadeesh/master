package com.main;

import com.model.RunInheritance;

public class UserMainCode extends Thread {

	public static void main(String[] args) {

		RunInheritance t1 = new RunInheritance();

		System.out.println("Name of t1:" + t1.getName());

		t1.start();
	}

}
