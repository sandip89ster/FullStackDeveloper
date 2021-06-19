package com.training.assignment17;

public class EncodingCharactersAtOddPlaces {
	public static String encodeString(String input) {
		String result = "";
		for (int i = 1; i <= input.length(); i++) {
			if (i % 2 == 0) {
				result += input.charAt(i - 1);
			} else {
				result += ((char) ((int) input.charAt(i - 1) + 1));
			}
		}
		return result;
	}

	public static void main(String[] args) {
		String input = "curiosity";
		System.out.println(encodeString(input));
	}
}
