package com.assignment2.oops;

public class StringUniqueCharacters {
	
	 static boolean isUniqueChars(String str) {
		int MAX=256;
		if(str.length()>MAX) {
			return false;
		}
		boolean isUnique[]=new boolean[MAX];
		for(int i=0;i<str.length();i++) {
			int val=str.charAt(i);
			if(isUnique[val]) return false;
			isUnique[val]=true;
			
		}
		return true;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(isUniqueChars("abc"));
		
	}

}
