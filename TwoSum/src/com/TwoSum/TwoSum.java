package com.TwoSum;
 
public class TwoSum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Solution sol = new Solution();
		int nums[] = {2, 7, 11, 15};
		int target = 18;
		int result[] = sol.twoSum(nums, target);
		System.out.printf("First : %d second: %d",result[0],result[1]);
	}

}
