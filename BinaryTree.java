package com.assignment2.oops;

public class BinaryTree {

	public static String reverse(int x) {
		String str=x+"";
        String result="";
        for(int i=str.length()-1;i>=0;i--){
            result+=str.charAt(i);
        }
        return result;
	      
	    }
	
	public static boolean isDigit(char str){
        if((str == '0') || (str == '1') || (str == '2') || (str == '3') || (str == '4') || (str == '5') || (str == '6') 
           || (str == '7') || (str == '8') || (str == '9')){
            return true;
        }
        return false;
    }
    public static String myAtoi(String str) {
        
        String result=" ";
        str=str.trim();
        for(int i=0; i<str.length();i++){
        	if(!(isDigit(str.charAt(i))  || str.charAt(i)== '+' || str.charAt(i)== '-')) {
        		break;
        	}
            if(isDigit(str.charAt(i))  || str.charAt(i)== '+' || str.charAt(i)== '-'){
                result+=str.charAt(i);
            }else {
            	break;
            }
        }
      return result;  
    }
    
    public static int maxArea(int[] height) {
        int l=0,r=height.length-1;
        int maxArea=0;
        while(l!=r){
            int a=Math.min(height[l],height[r])*(r-l);
            maxArea=(maxArea>a)?maxArea:a;
            if(height[l]<height[r])
                l++;
            else
                r--;
        }
        return maxArea;
    
    }
	
	public static void main(String[] args) {

		String result=reverse(1234);
		System.out.println(result);
		String res="-a1234";
		System.out.println(myAtoi(res));
		int[] arr={1,4,6,2};
		System.out.println(maxArea(arr));
		
	}

}
