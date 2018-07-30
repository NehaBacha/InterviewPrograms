package com.assignment2.oops;

import java.util.List;
import java.util.*;

public class SpecialPalindrome {

	// Complete the substrCount function below.
    static long substrCount(int n, String s) {
    	
    	List<Block> blocks=buildBlocks(s);
        long count=0;
        
        for (int i = 0; i < blocks.size(); i++) {
			count+=(long)blocks.get(i).length * (blocks.get(i).length +1)/2;
			
			if(blocks.get(i).length==1 && i>0 && i+1 <blocks.size()
					&& blocks.get(i-1).letter ==blocks.get(i+1).letter) {
				count+=Math.min(blocks.get(i-1).length, blocks.get(i+1).length);
			}
        }
        
        return count;

    }
    
    static List<Block> buildBlocks(String s){
    	
    	List<Block> blocks=new ArrayList<>();
    	char letter=0;
    	int length=-1;
    	for (int i = 0; i < s.length(); i++) {
			if(i<s.length() && s.charAt(i)==letter) {
				length++;
			}else {
				if(letter>0) {
					blocks.add(new Block(letter, length));
				}
				if(i < s.length()) {
					letter=s.charAt(i);
					length=1;
				}
			}
		}
    	
    	return blocks;
    	
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int n=6;
		String s="asasd";
		long result = substrCount(n, s);
		System.out.println(result);
	}

}
