package com.training.assignment16;

public class ModifyFirstString {

	public static String updateFirstString(String a, String b) {
		String result = "";
		b = b.toLowerCase();
		char[] split = a.toLowerCase().toCharArray();
		for(int i=0; i<a.length();i++) {
			if(b.contains(String.valueOf(split[i]))) {
				result+=a.charAt(i);
			}else {
				result+="+";
			}
		}
		return result;
	}

	public static void main(String[] args) {
		String input1 = "New York";
		String input2 = "New Jersy";
		System.out.println(updateFirstString(input1, input2));
	}

}
