package com.assignment2.oops;

/*Rotate the array from given index */
public class ArrayRotation {

    // Method to rotate array and return the rotated array.
    static int[] rotLeft(int[] arr, int d) {
        int n=arr.length;
        //rotate till given index
        for(int i=0;i<d;i++){
            leftrotate(arr,n);
        }

        return arr;
    }
    //Method to rotate array from given given index
    static void leftrotate(int[] arr,int n){
        int i, temp;
        temp=arr[0];
        for(i=0;i<n-1;i++)
            arr[i]=arr[i+1];
        arr[i]=temp;
    }

    public static void main(String[] args)  {
     
    	int[] arr= {3,5,6,1,7};
    	int[] result=rotLeft(arr, 2);
    	for (int i : result) {
    		System.out.print(i + " ");
		}
    	

    }
}

