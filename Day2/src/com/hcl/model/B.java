package com.hcl.model;

public class B extends A{
	private int var3;
	
	public B() {}
	
	public B(int var2, int var3) {
		super();
		this.var2 = var2;
		this.var3 = var3;
	}
	
	public void display() {
		System.out.println("Child class");
		System.out.println("var2 = " + var2);
		System.out.println("var3 = " + var3);
		
	}
	

}
