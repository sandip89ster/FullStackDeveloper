package com.training.assignment31;

import java.util.Scanner;

public class DaysOfWeekNewKeyword {
	public static void main(String[] args) {
		int input;
		String[] days = new String[] { "Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday" };
		Scanner in = new Scanner(System.in);
		System.out.println("Enter number from 1-7 :::: ");
		input = in.nextInt();
		in.close();
		System.out.println("Day of the Week is ::::: " + days[input - 1]);
	}
}
