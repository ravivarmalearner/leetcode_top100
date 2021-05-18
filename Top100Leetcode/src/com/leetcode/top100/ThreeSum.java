package com.leetcode.top100;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ThreeSum {

	public static List<List<Integer>> threeSum(int[] nums) {
	       Arrays.sort(nums);
	        List<List<Integer>> res = new ArrayList<>();
	        List<Integer> temp = null;
	        
	        if(nums.length == 0)
	            return res;
	        
	        int zerocnt = 0;
	        
	        for(int i = 0; i < nums.length - 2; i++){
	            int j = i + 1;
	            int k = nums.length - 1;
	            
	            if(nums[i] == 0)
	                zerocnt++;
	            if(i > 0 && nums[i] == nums[i - 1])
	                continue;
	            while(j < k){
	                if(nums[i] + nums[j] + nums[k] == 0){
	                    temp = new ArrayList<Integer>();
	                    temp.add(nums[i]);
	                    temp.add(nums[j]); temp.add(nums[k]);
	                    res.add(temp);
	                    j++; k--;
	                }
	                else if(nums[i] + nums[j] + nums[k] > 0){
	                    k--;
	                }
	                else{
	                    j++;
	                }
	            }
	        }
	        if(zerocnt == nums.length){
	            temp = new ArrayList<Integer>();
	            for(int i = 0; i < nums.length; i++)
	                temp.add(0);
	            res.add(temp);
	            return res;
	        }
	        return res;
	    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		threeSum(new int[] {-2,0,0,2,2});
	}

}
