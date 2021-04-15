package com.hcl.model;

public class Square extends Shape {

	private int length;

	public Square() {
		super();
	}

	public Square(String name, int length) {
		super();
		this.name = name;
		this.length = length;
	}

	public int getLength() {
		return length;
	}

	public void setLength(int length) {
		this.length = length;
	}

	@Override
	public float calculateArea() {
		return (this.length * this.length);
	}

}
