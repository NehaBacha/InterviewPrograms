package com.assignment2.oops;

import java.util.ArrayList;
import java.util.List;

public class ThreeSum {
	
	public static List<List<Integer>> threeSum(int[] nums){
		List<List<Integer>> lists=new ArrayList<List<Integer>>();
		List<Integer> singleList;
		for (int i = 0; i < nums.length-2; i++) {
			singleList=new ArrayList<>();
			singleList.add(nums[i]);
			for (int j = i+1; j < nums.length-1; j++) {
				if(nums[i]!=nums[j]){
					singleList.add(nums[j]);
				}else {
					continue;
				}
				for (int k = i+2; k < nums.length; k++) {
					if(!(singleList.contains(nums[k]))) {
						if((nums[i]+nums[j]+nums[k]) == 0) 
						{
							List<Integer> outputList = new ArrayList<>(singleList);
							outputList.add(nums[k]);
							lists.add(outputList);
						}
					}
				}
				singleList.remove(Integer.valueOf(nums[j]));
			}
			
		}
		
		return lists;
	}
	
	static void findTriplets(int[] arr, int n)
	{
	    boolean found = true;
	    for (int i=0; i<n-2; i++)
	    {
	        for (int j=i+1; j<n-1; j++)
	        {
	            for (int k=j+1; k<n; k++)
	            {
	                if (arr[i]+arr[j]+arr[k] == 0)
	                {
	                    System.out.print(arr[i]);
	                    System.out.print(" ");
	                    System.out.print(arr[j]);
	                    System.out.print(" ");
	                    System.out.print(arr[k]);
	                    System.out.print("\n");
	                    found = true;
	                }
	            }
	        }
	    }
	 
	    // If no triplet with 0 sum found in array
	    if (found == false)
	        System.out.println(" not exist ");
	 
	}

	public static void main(String[] args) {

		
		int[] nums= {-1,0,1,2,-1,-4};
		System.out.println(threeSum(nums));
		int n=nums.length;
		//findTriplets(nums,n);
		
		// create an empty array list
	    ArrayList<StringBuilder> arrlist1 = new ArrayList<StringBuilder>();

	    // use add for new value
	    arrlist1.add(new StringBuilder("from java2s.com"));

	    // using clone to affect the objects pointed to by the references.
	    ArrayList arrlist2 = (ArrayList) arrlist1.clone();
	    // appending the string
	    StringBuilder strbuilder = arrlist1.get(0);
	    strbuilder.append("tutorials");

	    System.out.println(arrlist1);
	    
	    System.out.println(arrlist2);
	    
	    
	    String expe= "Dear testUser testUser,"
	            + "You have been registered in the Request Management System. "
	            + "Your username is the email address to which this notification is addressed. "
	            + "Please click the link below to set your password: http://www.example.com/QA/ChangePassword.aspx?userName=example@yopmail.com&tempPassword=b0cb6ca7-2e52-4b80-8252-f5dac499cea3"
	            + "You will receive further information from the our employee that has registered you in the system."
	            + "Thank you";


	        String[] parts = expe.split("your password: ");
	        String part2 = parts[1]; 
	        parts = part2.split("You will receive further information");
	        part2 = parts[0]; 
	        System.out.println(part2);
	


		
	}

}
