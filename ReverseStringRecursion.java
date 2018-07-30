package com.assignment2.oops;

public class ReverseStringRecursion {

	public static String reverse(String str) 
    {     
        if ((str==null)||(str.length() <= 1) )
            return str;
        return reverse(str.substring(1)) + str.charAt(0);
    }
	
	
    public static void main(String[] args) 
    {
        
        String str = "Quora";
        System.out.println("Reverse of \'"+str+"\' is \'"+reverse(str)+"\'");    
    }    
}