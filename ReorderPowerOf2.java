package com.assignment2.oops;

import java.util.Arrays;

public class ReorderPowerOf2 {
	
	public boolean reorderedPowerOf2(int N) {
        long M;
        switch (N%9) 
        {
            case 1: case 2: case 4: case 8: M = (long) N%9;
                    break;
            case 7: M = 16;
                    break;
            case 5: M = 32;
                    break;
            default: return false;
        }
        
        long p = FloorPowerOfTen(N);
        
        for(; M<10*p; M<<=6){
            if(p>M) continue;
            return isPermutation(M,N);
        }
        return false;
    }
    
    private long FloorPowerOfTen(int N){
        long ans=1;
        while (10*ans <= N) ans*=10;
        return ans;
    }
    
    
    private boolean isPermutation(long M, int N){
        char [] Marray = ("" + M).toCharArray();
        char [] Narray = ("" + N).toCharArray();
        Arrays.sort(Marray);
        Arrays.sort(Narray);
        return Arrays.equals(Marray, Narray);
    }
    
    public static int binaryGap(int N) {
        int res = 0;
        for (int d = -32; N > 0; N /= 2, d++) {
    		System.out.println(d);
    		System.out.println("res"+ res);

            if (N % 2 == 1) {
                res = Math.max(res, d);
                d = 0;
            }
        }
        return res;
    }
    
	public static void main(String[] args) {

		System.out.println(binaryGap(8));
		int N=8;
		System.out.println(N/= 2);
	}

}
