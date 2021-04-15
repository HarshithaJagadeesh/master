package com.hcl.model;

public class Rectangle extends Shape {

	private int length;
	private int breadth;

	public Rectangle() {
		super();
	}

	public Rectangle(String name, int breadth, int lenght) {
		this.name = name;
		this.breadth = breadth;
		this.length = lenght;
	}

	public int getLength() {
		return length;
	}

	public void setLength(int length) {
		this.length = length;
	}

	public int getBreadth() {
		return breadth;
	}

	public void setBreadth(int breadth) {
		this.breadth = breadth;
	}

	@Override
	public float calculateArea() {
		return (this.breadth * this.length);
	}

}
