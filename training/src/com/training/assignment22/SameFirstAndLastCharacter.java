package com.training.assignment22;

public class SameFirstAndLastCharacter {
	public static int compareFirstAndLastCharacter(String input) {
		if (input.charAt(0) == input.charAt(input.length() - 1)) {
			return 1;
		}
		return -1;
	}

	public static void main(String[] args) {
		String input = "the picture was great";
		System.out.println(compareFirstAndLastCharacter(input));
	}

}
