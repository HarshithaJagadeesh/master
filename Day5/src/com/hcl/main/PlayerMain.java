package com.hcl.main;

import java.util.Scanner;

import com.hcl.exception.PlayerException;
import com.hcl.model.PlayerInfo;
import com.hcl.service.PlayerService;

public class PlayerMain {

	public static void main(String[] args) {

		String name;
		int age;

		Scanner scanner = new Scanner(System.in);
		PlayerInfo playerInfo;
		PlayerService playerService = new PlayerService();

		System.out.println("Enter the name of the player");
		name = scanner.next();
		System.out.println("Enter the age of the player");
		age = scanner.nextInt();

		playerInfo = new PlayerInfo(name, age);
		playerService = new PlayerService();

		try {

			boolean flag = false;
			flag = playerService.validateAge(playerInfo.getAge());
			if (flag == true) {
				System.out.println("Name of the player: " + playerInfo.getName());
				System.out.println("Age of the player: " + playerInfo.getAge());
			}
		} catch (PlayerException playerException) {
			System.out.println("Exception caught: " + playerException);
		} finally {
			scanner.close();
			playerInfo = null;
			playerService = null;
		}

	}

}
