package com.training.assignment06;

public class ConvertStringArrayToString {

	public static void main(String[] args) {
		String[] input = { "Vikas", "Lokesh", "Ashok" };
		String value = "";
		for (String txt : input) {
			value=value+txt+",";
		}
		value=value.substring(0,(value.length()-1));
		System.out.println("\""+value+"\"");
	}
}
