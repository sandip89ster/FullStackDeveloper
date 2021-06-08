package com.training.assignment15;

public class UniqueCharacters {
	
	public static String getUniqueCharacters(String input) {
		String temp = "";
		for(int i=0; i<input.length();i++) {
			if(!Character.isWhitespace(input.charAt(i))) {
				temp=temp+input.charAt(i);
			}
			input = input.replace(Character.toString(input.charAt(i)), " ");
		}
		return temp;
	}
	
	public static void main(String[] args) {
		String input = "helloworld";
		System.out.println(getUniqueCharacters(input));
	}
}
