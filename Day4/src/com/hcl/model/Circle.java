package com.hcl.model;

public class Circle extends Shape {

	private int radius;

	public Circle() {
		super();
	}

	public Circle(String name, int radius) {
		super();
		this.name = name;
		this.radius = radius;
	}

	public int getRadius() {
		return radius;
	}

	public void setRadius(int radius) {
		this.radius = radius;
	}

	@Override
	public float calculateArea() {
		float pi = 3.14f;

		return (pi * radius * radius);
	}

}
