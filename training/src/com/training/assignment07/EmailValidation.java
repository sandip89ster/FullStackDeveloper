package com.training.assignment07;

public class EmailValidation {

	public static boolean emailValidation(String email) {
		boolean flag = false;
		if (email.contains("@")) {
			int countAt = email.length() - email.replace("@", "").length();
			int countDot = email.length() - email.replace(".", "").length();
			if (countAt == 1 && countDot == 1) {
				int indexAt = email.indexOf("@");
				int indexDot = email.indexOf(".");
				int countAtDot = indexDot - indexAt - 2;
				if (countAtDot == 4) {
					if (indexAt > 2) {
						if (email.substring(email.length() - 4, email.length()).equals(".com")) {
							flag = true;
						}
					}
				}
			}
		}
		return flag;
	}

	public static void main(String[] args) {
		String input = "test@gmail.com";
		System.out.println(emailValidation(input));
	}

}
