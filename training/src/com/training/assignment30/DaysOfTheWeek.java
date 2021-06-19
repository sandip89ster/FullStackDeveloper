package com.training.assignment30;

import java.util.Scanner;

public class DaysOfTheWeek {
	public static void main(String[] args) {
		int input;
		String[] days = { "Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday" };
		Scanner in = new Scanner(System.in);
		System.out.println("Enter number from 1-7 :::: ");
		input = in.nextInt();
		in.close();
		System.out.println("Day of the Week is ::::: " + days[input - 1]);
	}
}
