package com.training.assignment14;

public class ConcatenateCharacterInPosition {

	public static String getValue(String[] input, int value) {
		String temp = "";
		for (String i : input) {
			try {
				temp = temp + i.charAt(value);
			} catch (Exception e) {
				temp = temp + "$";
			}
		}
		return temp;
	}

	public static void main(String[] args) {
		String[] input = { "abc", "da", "ram" };
		int value = 3;
		System.out.println(getValue(input, value-1));
	}

}
