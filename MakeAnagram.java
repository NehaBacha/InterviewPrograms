package com.assignment2.oops;

public class MakeAnagram {

	
	static int remAnagramforDeletion(String str1, String str2)
    {
        // make hash array for both string 
        // and calculate frequency of each
        // character
        int count1[] = new int[26]; 
        int count2[] = new int[26];
 
        // count frequency of each charcter 
        // in first string
        for (int i = 0; i < str1.length() ; i++)
            count1[str1.charAt(i) -'a']++;
     
        // count frequency of each charcter 
        // in second string
        for (int i = 0; i < str2.length() ; i++)
            count2[str2.charAt(i) -'a']++;
 
        // traverse count arrays to find 
        // number of charcters to be removed
        int result = 0;
        for (int i = 0; i < 26; i++)
            result += Math.abs(count1[i] -
                               count2[i]);
        return result;
    }
	static int remAnagram(String s1, String s2)
    {
		 int count = 0;
		 
	        // store the count of character
	        int char_count[] = new int[26];
	 
	        // iterate though the first String and update 
	        // count
	        for (int i = 0; i < s1.length(); i++) 
	            char_count[s1.charAt(i) - 'a']++;        
	 
	        // iterate through the second string
	        // update char_count.
	        // if character is not found in char_count
	        // then increase count
	        for (int i = 0; i < s2.length(); i++) 
	            if (char_count[s2.charAt(i) - 'a']-- <= 0)
	                count++;
	         
	        return count;
	    }
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str1 = "abc", str2 = "cde";
        System.out.println(remAnagram(str1, str2));
        

	}

}
