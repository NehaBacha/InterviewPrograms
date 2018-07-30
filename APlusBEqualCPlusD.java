package com.assignment2.oops;

/*Given an array check if a+b equals c+d and output 4 numbers
  */


public class APlusBEqualCPlusD {

	public static void main(String[] args) {

		int[] arr= {3,4, 7, 1, 2, 9, 8};
        findPairs(arr);
      
        
       
	}

	
	private static void findPairs(int[] arr) {
		
		int sum=0;
		for (int i = 0; i < arr.length-1; i++) {
			sum+=arr[i]+arr[i+1];
			for (int j = i+2; j < arr.length-2; j++) {
				if(sum==arr[j]+arr[j+1]) {
					System.out.println(arr[i]+ " " +arr[i+1]+ " "+arr[j]+ " " +arr[j+1]);
				}
				
			}
			sum=0;
			
		}

		
	}

}
