/**
 * Java program to have an abstract class named Shape which extends class Circle, Square and Rectangle
 * The user can input the shape of which area has to be calculated
 */

package com.hcl.main;

import java.util.Scanner;

import com.hcl.model.Circle;
import com.hcl.model.Rectangle;
import com.hcl.model.Shape;
import com.hcl.model.Square;

public class ShapeMain {

	public static void main(String[] args) {

		Scanner scanner;
		Shape shape;

		scanner = new Scanner(System.in);
		int number;
		try {

			do {

				System.out.println("Choose a number corresponding to theshape");
				System.out.println("1 for Circle");
				System.out.println("2 for Square");
				System.out.println("3 for Reactange");
				System.out.println("0 to quit");

				number = scanner.nextInt();
				switch (number) {

				case 1:
					System.out.println("Enter the radius for the circle");
					int radius = scanner.nextInt();
					shape = new Circle("Circle", radius);
					System.out.println("The Area of circle: " + shape.calculateArea());
					break;

				case 2:
					System.out.println("Enter the lenght of side for the square");
					int length = scanner.nextInt();
					shape = new Square("Square", length);
					System.out.println("The Area of square: " + shape.calculateArea());
					break;

				case 3:
					System.out.println("Enter the length and breadth for the rectangle");
					int len = scanner.nextInt();
					int breadth = scanner.nextInt();
					shape = new Rectangle("Rectangle", breadth, len);
					System.out.println("The Area of circle: " + shape.calculateArea());

				default:
					if(number == 0) {
						break;
					}
					else {
						System.out.println("Invalid number");
					}
				}

			} while (number != 0);
		} finally {
			scanner = null;
			shape = null;
		}
	}

}
