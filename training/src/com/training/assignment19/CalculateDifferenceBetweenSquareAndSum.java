package com.training.assignment19;

public class CalculateDifferenceBetweenSquareAndSum {

	public static int calculateDifference(int n) {
		int squares = 0;
		int sum = 0;
		for (int i = 0; i <= n; i++) {
			squares += Math.pow(i, 2);
			sum += i;
		}
		return (int) (squares - (Math.pow(sum, 2)));
	}

	public static void main(String[] args) {
		int n = 10;
		System.out.println(calculateDifference(n));

	}

}
