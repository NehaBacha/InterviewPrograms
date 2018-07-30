package com.assignment2.oops;

import java.util.Hashtable;
/* checkMagazine function, It must print  if the note can be formed using the magazine, or No*/
public class RansomNote {

	public static void main(String[] args) {

		String magazine="two times three is not four";
		String note="two times  is four";
		
		String result=ransomNote(magazine,note);
		System.out.println(result);
	}

	private static String ransomNote(String magazine, String note) {

		Hashtable<String, Integer> hashtableMagazine=new Hashtable<>();
		String[] str=magazine.split(" ");
		for (int i = 0; i < str.length; i++) {
			if(!(hashtableMagazine.containsKey(str[i]))) {
				hashtableMagazine.put(str[i], 1);
			}else {
				hashtableMagazine.put(str[i], hashtableMagazine.get(str[i])+1);
			}
			
		}
		
		String[] strNote=note.split(" ");
		for (int i = 0; i < strNote.length; i++) {
			
			if(hashtableMagazine.containsValue(0)){
				hashtableMagazine.remove(str[i]);
			}
			if(hashtableMagazine.containsKey(strNote[i])) {
				if(hashtableMagazine.get(str[i])>0) {
					hashtableMagazine.put(str[i], hashtableMagazine.get(str[i])-1);
				}else {
					return "NO";
				}
			}else {
				return "NO";
			}
		}
		System.out.println(hashtableMagazine);
		return "YES";
		
	}

}
