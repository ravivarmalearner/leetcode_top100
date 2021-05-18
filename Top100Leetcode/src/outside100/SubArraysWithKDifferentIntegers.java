package outside100;

import java.util.HashSet;

public class SubArraysWithKDifferentIntegers {

	public static int subarraysWithKDistinct(int[] nums, int k) {
        int n = nums.length;
        int end = n - k + 1;
        HashSet<Integer> set = new HashSet<Integer>(); 
        int cnt = 0;
        for(int i = 0; i < end; i++){
            int j = i;
            //set.add(nums[i]);
            while(j < n){
                set.add(nums[j]);
                if(!set.isEmpty() && set.size() == k)
                    cnt++;
                j++;
            }
            set.clear();
        }
        return cnt;
    }
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		subarraysWithKDistinct(new int[]{2, 1, 2, 1, 2}, 2);
	}

}
