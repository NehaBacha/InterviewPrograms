package com.assignment2.oops;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Random;

public class DataStructureToInsertDeleteAndRandomNumber {
	static HashMap<Integer, Integer> hashmap = new HashMap<>();
	static ArrayList<Integer> arr = new ArrayList<>();

	public static void main(String[] args) {

		insert(2);
		insert(5);
		insert(6);
		insert(2);
		insert(8);
		insert(9);
		delete(5);
		randomNumber(arr);
	}

	//Generating random number
	private static void randomNumber(ArrayList<Integer> arr) {
		Random random = new Random();
		System.out.println("Random number: " +arr.get(random.nextInt(arr.size())));

	}
	//Deletion
	private static void delete(int num) {

		//if list is empty
		if (hashmap.size() == 0) {
			System.out.println("List is empty");
		}
		//remove element from hashmap
		if (hashmap.containsKey(num)) {
			int i = hashmap.get(num);
			hashmap.remove(num);
			int len = arr.size();

			// swap element to be removed with last element and remove
			arr.set(i, arr.get(len - 1));
			arr.remove(arr.size() - 1);

			System.out.println("Deletion");
			System.out.println(arr);
		}
	}
	
	//Insertion
	private static void insert(int num) {
		
		//insert element in hashmap and array
		if (!(hashmap.containsKey(num))) {
			hashmap.put(num, arr.size());
			arr.add(num);
		}

	}
	
	
}
