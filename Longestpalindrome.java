package com.assignment2.oops;

/*Program to return longest Palindrome from string */
public class Longestpalindrome {
	
	public static boolean isPalindrome(String s){
        if(s.length()<=1){
            return false;
        }
        String compare1="";
        for(int i=s.length()-1;i>=0;i--){
            compare1+=s.charAt(i);
        }
        return compare1.equals(s);
           
    }
    public static String longestPalindrome(String s) {
        if(s.length()<=2){
            return "Invalid";
        }
        
        String longest="";
        for(int i=0;i<s.length()-1;i++){
        	String result="";
            result+=s.charAt(i);
            
            for(int j=i+1; j<s.length();j++){
                result+=s.charAt(j);
                if(result.length() > longest.length() && isPalindrome(result)){
                    longest=result;
                }
            }
        }
        return longest;
    }

	public static void main(String[] args) {
	
		System.out.println(longestPalindrome("ttabbat"));
	}

}
