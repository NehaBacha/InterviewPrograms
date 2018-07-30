package com.assignment2.oops;

//The deletion distance of two strings is the minimum number of characters you need to
//delete in the two strings in order to get the same string.

class DeletionDistance {

	static int deletionDistance(String str1, String str2) {
		// your code goes here

		int[][] map = new int[str1.length() + 1][str2.length() + 1];
		// initial initialize
		for (int i = 0; i <= str1.length(); i++)
			map[i][0] = i;
		for (int j = 1; j <= str2.length(); j++)
			map[0][j] = j;

		for (int i = 1; i <= str1.length(); i++) {
			for (int j = 1; j <= str2.length(); j++) {
				if (str1.charAt(i - 1) == str2.charAt(j - 1))
					map[i][j] = map[i - 1][j - 1];
				else {
					map[i][j] = min(map[i - 1][j], map[i][j - 1]) + 1;
				}
			}
		}
		return map[str1.length()][str2.length()];

	}

	private static int min(int i, int j) {
		if (i < j)
			return i;
		else
			return j;

	}

	public static void main(String[] args) {
		System.out.println(deletionDistance("some", "thing"));
	}

}

/*
 * import java.util.*;
 * 
 * class DeletionDistance {
 * 
 * static int deletionDistance(String str1, String str2) {
 * 
 * HashMap<Character,Integer> hashStr1=new HashMap<>(); for(char
 * i=0;i<str1.length() ; i++){ char ch=str1.charAt(i);
 * if(hashStr1.containsKey(ch)){ hashStr1.put(ch,hashStr1.get(ch)+1); }else{
 * hashStr1.put(ch,1); } } HashMap<Character,Integer> hashStr2=new HashMap<>();
 * for(char i=0;i<str2.length() ; i++){ char ch=str2.charAt(i);
 * if(hashStr2.containsKey(ch)){ hashStr2.put(ch,hashStr2.get(ch)+1); }else{
 * hashStr2.put(ch,1); } } int count=0; for(HashMap.Entry<Character,Integer>
 * entry: hashStr2.entrySet()){ if(entry.getValue()==1){ count++; } } return
 * count;
 * 
 * }
 * 
 * public static void main(String[] args) {
 * 
 * int result=deletionDistance("heat","hit"); System.out.println(result);
 * 
 * }
 * 
 * }
 */