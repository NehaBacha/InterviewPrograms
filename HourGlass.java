package com.assignment2.oops;

import java.util.*;
/*Maximum sum of hour glass in matrix, An hour glass is made of 7 cells in following form.
    A B C
      D
    E F G */

public class HourGlass {
      
    private static final int MIN_VALUE = -10000;
	public static int hourGlass(int[][] anArray, int n, int o) {
        int result;
        result = anArray[n][o] + anArray[n][o+1] + anArray[n][o+2] + anArray[n+1][o+1]
        + anArray[n+2][o] + anArray[n+2][o+1] + anArray[n+2][o+2];    
        return result;
    }
    public static void main(String[] args) {
    	System.out.println("enter values: ");
        Scanner in = new Scanner(System.in);
        int arr[][] = new int[6][6];
        for(int i=0; i < 6; i++){
            for(int j=0; j < 6; j++){
                arr[i][j] = in.nextInt();
            }
        }
        
        int ans = 0;
        int tempAns=MIN_VALUE;
        for(int m=0; m < 4; m++) {
            for(int o=0; o < 4; o++) {
                ans = hourGlass(arr, m, o);
                if(ans>tempAns){
                    tempAns = ans;
                }
            }
        }
        if(ans>=tempAns){
            System.out.println(ans);
        } else{
            System.out.println(tempAns);
        }
        in.close();
    }
}