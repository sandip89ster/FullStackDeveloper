package com.training.assignment41;

import java.util.Scanner;

public class ShapeClient {
	public static void main(String[] args) {
		int choice;
		Scanner in = new Scanner(System.in);
		System.out.println("Area Calculator");
		System.out.println("1. Square");
		System.out.println("2. Rectangle");
		System.out.println("3. Circle");
		System.out.println("4. Hexagon");
		choice = in.nextInt();
		Shape shape;
		switch (choice) {
		case 1:
			System.out.println("Enter the side ::::: ");
			int side = in.nextInt();
			shape = new Square(side);
			System.out.println("Area of Square is ::::: " + shape.calculateArea());
			break;
		case 2:
			System.out.println("Enter length and breadth :::: ");
			int length = in.nextInt();
			int breadth = in.nextInt();
			shape = new Rectangle(length, breadth);
			System.out.println("Area of Rectangle in :: " + shape.calculateArea());
			break;
		case 3:
			System.out.println("Enter the radius ::::: ");
			int radius = in.nextInt();
			shape = new Circle(radius);
			System.out.println("Area of Circle is ::::: " + shape.calculateArea());
			break;
		case 4:
			System.out.println("Enter the side ::::: ");
			int sideHex = in.nextInt();
			shape = new Hexagon(sideHex);
			System.out.println("Area of Square is ::::: " + shape.calculateArea());
			break;
		default:
			System.out.println("Enter valid input!!");
		}
		in.close();
	}
}
