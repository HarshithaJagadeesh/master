package com.hcl.model;

public class Bike extends Cycle {

	public Bike() {
		super();
		System.out.println("Hello I am a Bike I am " + define_me());
		String temp = super.define_me();
		System.out.println("My ancestor is a cycle who is " + temp);

	}

	public String define_me() {

		return "a cycle with an engine.";

	}

}
