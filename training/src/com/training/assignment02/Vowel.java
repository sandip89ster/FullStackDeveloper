package com.training.assignment02;

public class Vowel {
	public static void main(String[] args) {
		String txt = "NewyorkE";
		int counter = 0;
		txt = txt.toLowerCase();
		for (int i = 0; i < txt.length(); i++) {
			char val = txt.charAt(i);
			if (val == 'a' || val == 'e' || val == 'i' || val == 'o' || val == 'u') {
				counter += 1;
				txt = txt.replace(val, ' ');
			}
		}
		System.out.println("Total vowels : " + counter);
	}
}
