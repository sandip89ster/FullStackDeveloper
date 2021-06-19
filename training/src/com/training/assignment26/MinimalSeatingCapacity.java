package com.training.assignment26;

public class MinimalSeatingCapacity {

	public static void getMinimumSeatingCapacity(int[] input) {
		int min = Integer.MAX_VALUE;
		for (int i : input) {
			min = Math.min(min, i);
		}
		System.out.println(min);
	}

	public static void main(String[] args) {
		int[] input = { 30, 40, 20 };
		getMinimumSeatingCapacity(input);
	}

}
