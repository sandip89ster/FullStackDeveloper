package com.training.assignment20;

public class MirrorImage {
	public static String getImage(String input) {
		String result = "";
		for (int i = input.length() - 1; i >= 0; i--) {
			result += input.charAt(i);
		}
		return input + "|" + result;
	}

	public static void main(String[] args) {
		String input = "EARTH";
		System.out.println(getImage(input));
	}

}
