package com.hcl.model;

public class PlayerInfo {
	private String name;
	private int age;
	
	public PlayerInfo() {
		super();
	}

	public PlayerInfo(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

}
