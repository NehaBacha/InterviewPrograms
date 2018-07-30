package com.assignment2.oops;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

public class ValidString {

	 static String isValid(String s) {
	        
	        HashMap<Character,Integer> map=new HashMap<Character, Integer>();
	        for(int i=0;i<s.length();i++){
	            if(map.containsKey(s.charAt(i))){
	                map.put(s.charAt(i),map.get(s.charAt(i))+1);
	            }else{
	                map.put(s.charAt(i),1);
	            }
	        }
	        
	        Set<Integer> st = new HashSet<Integer>();
	        for(int freq : map.values())
	        {
	            st.add(freq);
	        }

	        if(st.size() >2) {
	        	return "No";
	        }
	      
	        return "YES";
	    }
	 
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String s="aabbcd";
		String result = isValid(s);
		System.out.println(result);
	}

}
