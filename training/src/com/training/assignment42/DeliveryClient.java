package com.training.assignment42;

import java.util.Scanner;

public class DeliveryClient {
	public static void main(String[] args) {
		String bowler, batsman;
		long runs;
		int choice;
		System.out.println("1. Player details of the delivery");
		System.out.println("2. Run details of the delivery");
		Delivery delivery = new Delivery();
		Scanner in = new Scanner(System.in);
		choice = in.nextInt();
		switch (choice) {
		case 1:
			bowler = in.nextLine();
			System.out.println("Enter Bowler Name : ");
			bowler = in.nextLine();
			System.out.println("Enter Bastman name : ");
			batsman = in.nextLine();
			delivery.displayDeliveryDetails(bowler, batsman);
			break;
		case 2:
			System.out.println("Enter the number of runs : ");
			runs = in.nextLong();
			delivery.displayDeliveryDetails(runs);
			break;
		default:
			System.out.println("Enter Valid input !!");
		}
		in.close();
	}
}
