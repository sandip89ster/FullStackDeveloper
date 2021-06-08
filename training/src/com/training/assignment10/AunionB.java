package com.training.assignment10;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class AunionB {
	
	public static String unionOfArrays(int[] a, int[] b) {
		Set<Integer> set = new HashSet<Integer>();
		for (int i : a) {
			set.add(i);
		}
		for (int i : b) {
			set.add(i);
		}
		Object[] c = set.toArray();
		return Arrays.toString(c);
	}
	
	public static void main(String[] args) {
		int[] a={1,2,3,4}; 
		int[] b={3,4,5,6};
		System.out.println(unionOfArrays(a, b));
	}

}
