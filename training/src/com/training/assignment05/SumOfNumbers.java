package com.training.assignment05;

public class SumOfNumbers {

	public static int getNumberSum(String[] input) {
		int sum = 0;
		for (String txt : input) {
			char[] tmp = txt.toCharArray();
			for (char t : tmp) {
				if (Character.isDigit(t)) {
					sum = sum + Character.getNumericValue(t);
				}
			}
		}
		return sum;
	}

	public static void main(String[] args) {
		String[] input = { "2AA", "12", "ABC", "c1a" };
		System.out.println(getNumberSum(input));
	}
}
