package com.training.assignment11;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

public class AintersectionB {
	
	public static String findAIntersectionB(int[]a, int[] b) {
		Map<Integer, Integer> map = new HashMap<Integer, Integer>();
		for (int i : a) {
			if(map.get(i) == null) {
				map.put(i, 1);
			}else {
				map.put(i, map.get(i)+1);
			}
		}
		for (int i : b) {
			if(map.get(i) == null) {
				map.put(i, 1);
			}else {
				map.put(i, map.get(i)+1);
			}
		}
		List<Integer> list = new ArrayList<Integer>();
		for(Entry<Integer, Integer> entry : map.entrySet()) {
			if(entry.getValue()>1) {
				list.add(entry.getKey());
			}
		}
		Object[] res = list.toArray();
		return Arrays.toString(res);
	}
	
	public static void main(String[] args) {
		int[] a={1,2,3,4}; 
		int[] b={3,4,5,6};
		System.out.println(findAIntersectionB(a, b));
	}

}
