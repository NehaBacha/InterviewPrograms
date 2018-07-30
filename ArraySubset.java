package com.assignment2.oops;

import java.util.Hashtable;
import java.util.Set;

/*To check if second array is subset of first array */
public class ArraySubset {

	public static void main(String[] args) {

		int[] arr1 = new int[] { 1, 4, 2 };
		int[] arr2 = new int[] { 1, 4, 4, 2 };

		Boolean result = subsetArray(arr1, arr2);
		if (result == true) {
			System.out.println("Array 2 is subset of array 1");
		} else {
			System.out.println("Not a subset");
		}

	}

	// Returns true if array2 is subset of array1
	private static Boolean subsetArray(int[] arr1, int[] arr2) {

		int count = 0;
		//adding first array values to hashtable
		Hashtable<Integer, Integer> hashtable = new Hashtable<>();

		for (int i = 0; i < arr1.length; i++) {
			if (!(hashtable.containsKey(arr1[i]))) {
				hashtable.put(arr1[i], 1);
			} else {
				hashtable.put(arr1[i], hashtable.get(arr1[i] + 1));
			}

		}
		Set s = hashtable.entrySet();

		//To check if array2 values are in hashtable
		for (int i = 0; i < arr2.length; i++) {
			if (hashtable.containsKey(arr2[i])) {
				count++;
			}
		}

		return count == arr2.length;
	}

}
