package com.assignment2.oops;

/*Program to return closest number from array using binary search tree */
public class ClosestNumberArray {

	static int binarySearchtree(int[] arr,int value){

		int n=arr.length;
		//corner cases
		if(value<=arr[0]) {
			return arr[0];
		}
		if(value>=arr[n-1]) {
			return arr[n-1];
		}
			
		//binary search
		int i=0,j=n,mid=0;
		while(i<j){
			
			mid=(i+j)/2;

			if(arr[mid]==value){
				return arr[mid];
			}
			if(value<arr[mid]){
				if(mid>0 && value>arr[mid-1])
					return closest(arr[mid-1],arr[mid],value);
				j=mid;
			}else{
				if(mid<n-1 && value<arr[mid-1])
					return closest(arr[mid],arr[mid+1],value);
				i=mid+1;
			}
		}
		return arr[mid];
	
	}

	static int closest(int value1,int value2,int value){
			if(value-value1>=value2 - value)
				return value2;
			else
				return value1;
	}
	
	public static void main(String[] args) {

		int[] arr= {5,8,10,16,30};
		
		System.out.println(binarySearchtree(arr,17));
		
	}

}
