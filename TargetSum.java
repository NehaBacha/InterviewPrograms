package com.assignment2.oops;

import java.util.HashMap;


public class TargetSum {

	static boolean checkTargetSum(int[] arr, int target) {

		HashMap<Integer, Integer> hashmap = new HashMap<>();
		System.out.println(hashmap.size());
		for (int i = 0; i < arr.length; i++) {
			int val = target - arr[i];
			if (hashmap.containsKey(val)) {
				return true;
			}
			hashmap.put(arr[i], i);
		}
		System.out.println(hashmap.size());
		return false;
	}

	public static void main(String[] args) {
		int[] arr = { 5, 7, 2, 4 };
		System.out.println(checkTargetSum(arr, 8));

	}

}
