package com.training.assignment18;

public class SumOfFirstNNaturalNumDivisibbleBy3And5 {

	public static int calculateSum(int n) {
		int result = 0;
		for (int i = 1; i < n; i++) {
			if (i % 3 == 0 || i % 5 == 0) {
				result += i;
			}
		}
		return result;
	}

	public static void main(String[] args) {
		int n = 10;
		System.out.println(calculateSum(n));
	}

}
