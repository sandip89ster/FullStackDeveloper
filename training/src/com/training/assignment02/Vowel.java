package com.training.assignment02;

public class Vowel {
	public static boolean compare(char val1, String val2) {
		int value = Character.valueOf(val1).compareTo(Character.valueOf(val2.charAt(0)));
		if (value == 0) {
			return true;
		}
		return false;
	}

	public static void main(String[] args) {
		String txt = "NewyorkE";
		int counter = 0;
		txt = txt.toLowerCase();
		for (int i = 0; i < txt.length(); i++) {
			char val = txt.charAt(i);
			if (compare(val,"a") || compare(val,"e") || compare(val,"i") || compare(val,"o") || compare(val,"u")) {
				counter += 1;
				txt = txt.replace(Character.toString(val), "");
			}
		}
		System.out.println("Total vowels : " + counter);
	}
}
