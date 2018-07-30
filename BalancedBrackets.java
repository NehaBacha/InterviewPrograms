package com.assignment2.oops;

import java.util.Stack;

//Program to check if brackets are balanced

public class BalancedBrackets {
	
	//Method to return count greater then 1 if brackets are not balanced else 0
	static int balanced(String text) {
	
		Stack<Character> openParens = new Stack<>();
		int count=0;
		for(Character ch: text.toCharArray()) {
			
		    if(ch == '(') {
		        openParens.push(ch);
		        count++;
		    } else if(ch == ')') {
		        if(openParens.empty()) {
		            return 0; //unbalanced
		        } else {
		            openParens.pop();
		            count--;
		        }
		    }
		}
		return count;
	}
	//Method to check brackets are balanced or no
	 static String isBalanced(String s) {
	        Stack<Character> stack=new Stack<>();
	        
	        for(int i=0;i<s.length();i++){
	            char ch=s.charAt(i);
	            
	            if(ch=='{' || ch=='('  || ch=='['){
	                stack.push(ch);
	            } else if(ch=='}' || ch==')'  || ch==']'){
	                if (stack.isEmpty())
	               {
	                   return "No";
	               } 
	      
	             /* Pop the top element from stack, if 
	                it is not a pair parenthesis of character 
	                then there is a mismatch. This happens for 
	                expressions like {(}) */
	             else if ( !isMatchingPair(stack.pop(), ch) )
	               {
	                   return "No";
	               }
	            }
	        }
	        if(!stack.isEmpty())
	            return "NO";
	        return "YES";
	    }
	    //Method to check matching pair
	    static boolean isMatchingPair(char character1, char character2)
	    {
	       if (character1 == '(' && character2 == ')')
	         return true;
	       else if (character1 == '{' && character2 == '}')
	         return true;
	       else if (character1 == '[' && character2 == ']')
	         return true;
	       else
	         return false;
	    }
		
	

	public static void main(String[] args) {

		System.out.println(isBalanced("{{[[(())]]}}"));
		System.out.println(balanced("{{[[(())]]}}"));
		
	
		
	}

}
