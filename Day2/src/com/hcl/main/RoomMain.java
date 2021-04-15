/**
 * Java program to take inputs of Room No., AcMachinhe, Room area and the type
 * and to display the informations of the user's room
 */


package com.hcl.main;

import com.hcl.model.Room;

public class RoomMain {

	public static void main(String[] args) {
		Room room = new Room();
		room.setRoomNo(7);
		room.setRoomType("Double bed-room");
		room.setMachineAC(false);
		room.setArea(10.0f);
		
		room.display();
		
		room = null;
		
	}
}
