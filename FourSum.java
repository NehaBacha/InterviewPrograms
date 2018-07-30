package com.assignment2.oops;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/*Given an array and target value return List of list with 4 number which whose sum is equal to target value,
 *  values are repeated in list  */

public class FourSum {

	
	public static void kSum(int[] nums, int k, int target, int from, int end, List<Integer> cur, List<List<Integer>> result){
		if (k < 2){
			return;
		}
		if (k == 2) {
			int left = from;
			int right = end;
			while(left < right){
				int diff = target- nums[left] - nums[right];
				if (diff == 0){
					List<Integer> r = new ArrayList<>();
					r.add(nums[left]);
					r.add(nums[right]);
					r.addAll(cur);
					result.add(r);
					while(left < right && nums[left] == nums[left + 1]) left++;
					while(left < right && nums[right] == nums[right - 1]) right--;
					left++;
					right--;
				}else if (diff > 0){
					left++;
				}else {
					right--;
				}
			}
		} else {
			for(int i = from; i < end - k + 2; i++){
				int temp = k;	
				int large = 0;
				int small = 0;
				while (temp > 0){
					large += nums[end - temp + 1];
					small += nums[from + temp - 1];
					temp--;
				}
				if(small > target) return;
				if(large < target) return;
				if(i > from && nums[i] == nums[i - 1]) continue;
				cur.add(nums[i]);
				kSum(nums, k - 1, target - nums[i], i + 1, end, cur, result);
				cur.remove(cur.size() - 1);
			}
		}
	}
    
    public static List<List<Integer>> fourSum(int[] nums, int target) {
    	int k = 4;
    	int length = nums.length;
    	List<List<Integer>> result = new ArrayList<>();
    	List<Integer> cur = new ArrayList<>();
    	Arrays.sort(nums);
    	kSum(nums, k, target, 0, length - 1, cur, result);
    	return result;
    }

	public static void main(String[] args) {

		int[] nums= {1, 0, -1, 0, -2, 2};
		List<List<Integer>> result= new ArrayList<>();
		
		result=fourSum(nums, 2);
		System.out.println(result);
	}

}
