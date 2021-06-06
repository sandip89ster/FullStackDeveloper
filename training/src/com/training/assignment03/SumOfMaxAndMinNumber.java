package com.training.assignment03;

public class SumOfMaxAndMinNumber {
	public static void main(String[] args) {
		int[] input = { 19, 17, 12 };
		int max = input[0], min = input[0];
		for (int i = 1; i < input.length; i++) {
			if (max <= input[i]) {
				max = input[i];
			}
		}
		for (int i = 0; i < input.length; i++) {
			if (min >= input[i]) {
				min = input[i];
			}
		}
		System.out.println("Sum of max and min number ::: "+(max+min));
	}
}
