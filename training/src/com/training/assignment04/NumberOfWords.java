package com.training.assignment04;

public class NumberOfWords {
	public static void main(String[] args) {
		String[] input = {"aa", "b", "cc", "ddd"};
		int find_characters_1 = 1, counter=0;
		for (String txt : input) {
			if(txt.length()==find_characters_1) {
				counter+=1;
			}
		}
		System.out.println("Number of character with length "+find_characters_1+" : "+counter);
	}
}
