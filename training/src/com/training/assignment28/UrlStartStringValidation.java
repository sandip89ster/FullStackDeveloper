package com.training.assignment28;

import java.util.Scanner;

public class UrlStartStringValidation {

	public static void checkStringforStartString(String url, String startString) {
		int size = startString.length();
		if (url.substring(0, size).equalsIgnoreCase(startString)) {
			System.out.println(url + " starts with " + startString);
		} else {
			System.out.println(url + " does not start with " + startString);
		}
	}

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String url, startString;
		System.out.println("Enter the String :::::::::: ");
		url = in.nextLine();
		System.out.println("Enter the start String :::: ");
		startString = in.nextLine();
		in.close();
		checkStringforStartString(url, startString);
	}

}
