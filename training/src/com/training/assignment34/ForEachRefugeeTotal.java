package com.training.assignment34;

import java.util.Scanner;

public class ForEachRefugeeTotal {
	public static void main(String[] args) {
		int tents, total = 0;
		System.out.println("Enter number of tents :::: ");
		Scanner in = new Scanner(System.in);
		tents = in.nextInt();
		int[] refugee = new int[tents];
		for (int i = 0; i < tents; i++) {
			refugee[i] = in.nextInt();
		}
		in.close();
		for (int i : refugee) {
			total += i;
		}
		System.out.println("Total refugees :::::: " + total);
	}
}
