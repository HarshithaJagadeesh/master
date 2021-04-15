package com.hcl.model;

public class A {
	private int var1;
	protected int var2;
	
	public A() {}
	
	public A(int var1, int var2) {
		this.var1 = var1;
		this.var2 = var2;
	}
	
	public void display() {
		System.out.println("Parent class");
		System.out.println("var1 = " + var1);
		System.out.println("var2 = " + var2);
	}
	
}
