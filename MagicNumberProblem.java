package com.assignment2.oops;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Set;

import com.sun.javafx.collections.MappingChange.Map;
public class MagicNumberProblem {

	    public static boolean arithmeticBoggle(
	        int magicNumber,
	        ArrayList<Integer> numbers
	    ) {
	        
	        //base cases.
	        if((numbers == null || numbers.size()==0) && magicNumber!=0)
	        {
	            return false;
	        }
	        
	        
	        ArrayList<Integer> current_sum = new ArrayList<Integer>();
	        current_sum.add(numbers.get(0));
	        current_sum.add(-1 * numbers.get(0));
	        for(int i=1; i< numbers.size();i++)
	        {
	          ArrayList<Integer> next_sum = new ArrayList<Integer>();
	          for(int j=0;j<current_sum.size();j++)
	          {
	              next_sum.add(current_sum.get(j) + numbers.get(i));
	              next_sum.add(current_sum.get(j) - numbers.get(i));
	          }
	          current_sum = next_sum;
	        }
	        
	        //Check if number is present.
	        return current_sum.contains(magicNumber);
	            
	    }
	    
	
	public static void main(String[] args) {

		ArrayList<Integer> arr=new ArrayList<>();
		arr.add(1);
		arr.add(2);
		arr.add(3);
		arr.add(4);
		System.out.println(arithmeticBoggle(2,arr));
	}

}
