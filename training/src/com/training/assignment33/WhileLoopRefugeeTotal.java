package com.training.assignment33;

import java.util.Scanner;

public class WhileLoopRefugeeTotal {
	public static void main(String[] args) {
		int tents, total = 0;
		Scanner in = new Scanner(System.in);
		System.out.println("Number of tents ::::: ");
		tents = in.nextInt();
		while (tents-- > 0) {
			System.out.println("Enter tent " + (tents + 1) + " count");
			total = total + in.nextInt();
		}
		in.close();
		System.out.println("Total number of Refugees :::::: " + total);
	}
}
