package com.assignment2.oops;

import java.util.ArrayList;
import java.util.HashSet;

public class StringRotation {

	 private static boolean isSubString(String s3, String s2){
	        int lengthS3 = s3.length();
	        int lengthS2 = s2.length();
	        for (int i = 0; i < lengthS3; i++) {
	            int j = i;
	            int k = 0;
	            while(s2.charAt(k++) == s3.charAt(j++)){
	                if(k == lengthS2)
	                    return true; 
	            }
	        }
	        return false;
	    }
	 
	 static ArrayList<String> powerSet(String s) {
		    return new ArrayList<>(_powerSet(s));
		}

		static HashSet<String> _powerSet(String s) {
		    HashSet<String> set = new HashSet<>();
		    set.add(s);

		    for(int i = 0; i < s.length(); i++) {
		        String tmp = s.substring(0, i) + s.substring(i+1, s.length());
		        set.addAll(_powerSet(tmp));
		    }

		    return set;
		}
		
		public static ArrayList<ArrayList<Integer>> getSubsets(ArrayList<Integer> set, int index){
			
			ArrayList<ArrayList<Integer>> allsubSets;
			if(set.size() == index){
				allsubSets=new ArrayList<ArrayList<Integer>>();
				allsubSets.add(new ArrayList<Integer>());
			}else {
				allsubSets=getSubsets(set, index+1);
				int item=set.get(index);
				ArrayList<ArrayList<Integer>> moresubsets= new ArrayList<>();
				
				for (ArrayList<Integer> subSet : allsubSets) {
					ArrayList<Integer> newsubset=new ArrayList<>();
					newsubset.addAll(subSet);
					newsubset.add(item);
					moresubsets.add(newsubset);
				}
				allsubSets.addAll(moresubsets);
			}
			
			
			return allsubSets;
		}
		
		//count of subsets

		static int numberOfSubset(ArrayList<Integer> arr,int index){
			int count=0;

			if(arr.size() == index){
				return count+1;
			}
			int moreSubset = numberOfSubset(arr,index+1);	

			return 2*moreSubset;
		}
		
		//subset of string
		
		static ArrayList<String> Stringsubset(String s,int n){
			
			ArrayList<String> outputArray=new ArrayList<>();
			if(n==0){
				char val=s.charAt(0);
				outputArray.add(Character.toString(val));
				return outputArray;
			}
			ArrayList<String> recursiveArray=new ArrayList<>();
			recursiveArray=Stringsubset(s,n-1);
			char currentChar=s.charAt(n);
			outputArray.add(Character.toString(currentChar));
			System.out.println(currentChar);

			for(String str1: recursiveArray){
				str1= str1 + currentChar ;
				recursiveArray.add(str1);
				System.out.println(recursiveArray);
				}

			outputArray.addAll(recursiveArray);
			return outputArray ;

		}
		
		static int NonZeroElement(ArrayList<Integer> arr,int n){
			int count=0;
			if(n==0){
				return count;
			}

			int num=NonZeroElement(arr,n-1);
			int index=n;
			if(arr.get(index)!=0){
				count++;
			}
			return count;
		}
		
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println(isSubString("watermelon", "ermelon"));
		int n=3;
		System.out.println(1<<n);
		ArrayList<Integer> arr=new ArrayList<>();
		arr.add(3);
		arr.add(4);
		arr.add(5);
		ArrayList<Integer> s= new ArrayList<>();
		s.add(1);
		s.add(2);
		s.add(3);
		 ArrayList<ArrayList<Integer>> result=getSubsets(s, 0);
		System.out.println(result);
		System.out.println(numberOfSubset(s, 0));
		System.out.println("--------");
		//System.out.println(maxNumer(arr, arr.size()-1));
		System.out.println(NonZeroElement(arr, arr.size()-1));
		
	}

}
