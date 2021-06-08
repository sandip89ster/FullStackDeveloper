package com.training.assignment13;

public class BinaryConversion {
	
	public static String convertToBinary(int value) {
		return Integer.toBinaryString(value);
	}
	
	public static void main(String[] args) {
		int input = 12;
		System.out.println(convertToBinary(input));
	}

}
