package com.hcl.model;

public class Room {
	private int roomNo;
	private String roomType;
	private boolean machineAC;
	private float area;
	
	public Room() {}
	
	public void setRoomNo(int roomNo) {
		this.roomNo = roomNo;
	}
	
	public void setRoomType(String roomType) {
		this.roomType = roomType;
	}

	public void setMachineAC(boolean machineAC) {
		this.machineAC = machineAC;
	}
	
	public void setArea(float area) {
		this.area = area;
	}
	
	public void display() {
		System.out.println("Room No. : " + roomNo);
		System.out.println("Room type: " + roomType);
		System.out.println("AC availabilty: " + machineAC);
		System.out.println("Area of the room: " + area + "ft.");
	}
	
	

}
