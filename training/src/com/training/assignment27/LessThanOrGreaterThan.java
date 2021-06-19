package com.training.assignment27;

import java.util.Scanner;

public class LessThanOrGreaterThan {

	public static void compareLessOrGreater(int a, int b) {
		if (a > b) {
			System.out.println(a + " is greater than " + b);
		} else if (b > a) {
			System.out.println(a + " is less than " + b);
		} else {
			System.out.println(a + " is equal to " + b);
		}
	}

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int a, b;
		System.out.println("Enter First Number :::::: ");
		a = in.nextInt();
		System.out.println("Enter Second Number ::::: ");
		b = in.nextInt();
		in.close();
		compareLessOrGreater(a, b);
	}

}
