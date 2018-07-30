package com.assignment2.oops;

import java.util.HashMap;

public class romanToInt {

	
	// This function returns value of a Roman symbol
	static int value(char r)
    {
        if (r == 'I')
            return 1;
        if (r == 'V')
            return 5;
        if (r == 'X')
            return 10;
        if (r == 'L')
            return 50;
        if (r == 'C')
            return 100;
        if (r == 'D')
            return 500;
        if (r == 'M')
            return 1000;
        return -1;
    }
 
    // Finds decimal value of a given romal numeral
    public static int romanToDecimal(String str)
    {
        // Initialize result
        int res = 0;
 
        for (int i=0; i<str.length(); i++)
        {
            // Getting value of symbol s[i]
            int s1 = value(str.charAt(i));
 
            // Getting value of symbol s[i+1]
            if (i+1 <str.length())
            {
                int s2 = value(str.charAt(i+1));
 
                // Comparing both values
                if (s1 >= s2)
                {
                    // Value of current symbol is greater
                    // or equalto the next symbol
                    res = res + s1;
                }
                else
                {
                    res = res + s2 - s1;
                    i++; // Value of current symbol is
                    // less than the next symbol
                }
            }
            else
            {
                res = res + s1;
                i++;
            }
        }
 
        return res;
    }
 
    
	public static int romanToInt1(String s) {
        HashMap<Character,Integer> map=new HashMap<>();       
        
        map.put('I',1);
        map.put('V',5);
        map.put('X',10);
        map.put('L',50);
        map.put('C',100);
        map.put('D',500);
        map.put('M',1000);
        
        int result=0;
        for(int i=0 ;i<s.length();i++){
            int intVal=map.get(s.charAt(i));
            if(i+1 < s.length()){
                 int s1=map.get(s.charAt(i+1));
                if(intVal >= s1){
                    result+=s1;
                }else{
                    result+=result + s1 -intVal;
                    i++;
            }
           }else{
                result=result+intVal;
                i++;
            }
      }
    return result;
}
	
	public static void main(String[] args) {

		System.out.println(romanToInt1("MCMXCIV"));
		System.out.println(romanToDecimal("MCMXCIV"));
	}

}
