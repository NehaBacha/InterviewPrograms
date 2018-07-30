package com.assignment2.oops;

import java.util.Arrays;
import java.util.Comparator;
/* Program to sort strings and return the sorted string value in a position*/

public class SortStrings {

	public static void main(String[] args) {
		String str1 = " Hi How are you";
		String[] arr1 = str1.split(" ");
		for (int i = 0; i < arr1.length; i++) {
			System.out.print(sortString(arr1[i]) + " ");

		}

	}
	//to sort strings using Comparator and String Builder is used
	private static String sortString(String str) {

		Character ch[] = new Character[str.length()];
		for (int i = 0; i < str.length(); i++) {
			ch[i] = str.charAt(i);
		}
		Arrays.sort(ch, new Comparator<Character>() {

			@Override
			public int compare(Character o1, Character o2) {

				return Character.compare(Character.toLowerCase(o1), Character.toLowerCase(o2));
			}
		});
		StringBuilder stringBuilder = new StringBuilder(ch.length);
		for (Character character : ch) {
			stringBuilder.append(character.charValue());
		}
		return stringBuilder.toString();
	}

}
