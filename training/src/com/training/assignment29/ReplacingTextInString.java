package com.training.assignment29;

public class ReplacingTextInString {

	public static void main(String[] args) {
		String input = "ITT is a private organisation. ITT is a product based company. DBox is a ITT product";
		String oldName = "ITT";
		String newName = "TTT";
		System.out.println("Old String :::::::: " + input);
		System.out.println("New String :::::::: " + input.replace(oldName, newName));

	}

}
