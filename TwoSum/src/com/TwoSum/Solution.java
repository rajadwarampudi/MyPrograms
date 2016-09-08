package com.TwoSum;
import java.util.*;

public class Solution {
    
	public int[] twoSum(int[] nums, int target) {
        
        int result[] = {0,0};
		HashMap<Integer, Integer> remainMap = new HashMap<Integer, Integer>();
		
		for(int i = 0; i < nums.length ; i++) {
			if(remainMap.get(target-nums[i]) != null) {
				result[0] = remainMap.get(target-nums[i]);
				result[1] = i;
				return result;
			}
			remainMap.put(nums[i], i);
		}
		
		return result;
    }

}
