package com.training.assignment32;

import java.util.Scanner;

public class ForLoopRefugeeTotal {

	public static void main(String[] args) {
		int tents, total = 0;
		Scanner in = new Scanner(System.in);
		System.out.println("Number of tents ::::: ");
		tents = in.nextInt();
		for (int i = 0; i < tents; i++) {
			System.out.println("Enter tent " + (i + 1) + " count");
			total = total + in.nextInt();
		}
		in.close();
		System.out.println("Total number of Refugees :::::: " + total);
	}
}
