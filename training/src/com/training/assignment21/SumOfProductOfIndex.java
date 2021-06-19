package com.training.assignment21;

public class SumOfProductOfIndex {
	public static int sumOfProductOfIndex(int[] input) {
		int result = 0;
		for (int i = 0; i < input.length; i++) {
			result += Math.pow(input[i], i);
		}
		return result;
	}

	public static void main(String[] args) {
		int[] input = { 3, 6, 2, 1 };
		System.out.println(sumOfProductOfIndex(input));
	}

}
