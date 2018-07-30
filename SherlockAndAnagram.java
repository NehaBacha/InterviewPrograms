package com.assignment2.oops;

import java.util.HashMap;
import java.util.Hashtable;
import java.util.stream.Collector;
import java.util.stream.Collectors;

import com.sun.javafx.collections.MappingChange.Map;

public class SherlockAndAnagram {

  /*  static int sherlockAndAnagrams(String s) {
        int count=0;
        Hashtable<Character,Integer> hashtable=new Hashtable<>();
        if(anagram(s)){
            
            for(int i=0;i<s.length();i++){
	            if(hashtable.containsKey(s.charAt(i))){
	                hashtable.put(s.charAt(i),hashtable.get(s.charAt(i))+1);
	            }else{
	                hashtable.put(s.charAt(i),1);
	            }
	        }
            
            for(HashMap.Entry<Character,Integer> entry: hashtable.entrySet()){
                if(entry.getValue()%2==0){
                  //  int val=entry.getValue()/2;
                    count+=entry.getValue();
                }
            }
        }else{
        	for(int i=0;i<s.length();i++){
	            if(hashtable.containsKey(s.charAt(i))){
	                hashtable.put(s.charAt(i),hashtable.get(s.charAt(i))+1);
	            }else{
	                hashtable.put(s.charAt(i),1);
	            }
	        }
            
            for(HashMap.Entry<Character,Integer> entry: hashtable.entrySet()){
                if(entry.getValue()%2==0){
                   int val=entry.getValue()/2;
                    count+=val;
                }
            }
        }
        System.out.println(hashtable);
        return count;

    }
    static boolean anagram(String s){
        int j=0;
        int count=0;
        for(int i=s.length()-1;i>=0;i--){
            if(s.charAt(i)==s.charAt(j)){
                j++;
                count++;
            }
        }
        if(count==s.length())
            return true;
        return false;
    }*/
	static int findUnorderedAnagramPairNum(String str) {
		HashMap<String, Integer> key2count = new HashMap<String, Integer>();
		for (int i = 0; i < str.length(); i++) {
			for (int j = i + 1; j <= str.length(); j++) {
				String key = generateKey(str.substring(i, j));
				if (!key2count.containsKey(key)) {
					key2count.put(key, 0);
				}
				key2count.put(key, key2count.get(key) + 1);
			}
		}
		System.out.println(key2count);
		return key2count.values().stream().mapToInt(count -> count * (count - 1) / 2).sum();
	}

	static String generateKey(String str) {
		return str.chars().sorted().mapToObj(letter -> String.valueOf((char) letter)).collect(Collectors.joining());
	}
        
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(findUnorderedAnagramPairNum("kkkk"));

	}

}
