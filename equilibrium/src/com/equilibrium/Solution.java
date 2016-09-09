package com.equilibrium;

public class Solution {
	public int solution(int[] A) {
		int i = 0;                       //forward index
		int j = A.length-1;              //reverse index
		long leftSum = 0,rightSum = 0;
		
		while(i < j)
			leftSum += A[i++];         //calculating the total sum first
		
		while(j>=1)
		{
			//subtract each number from the last from the total_sum
			//calculate sum of numbers from the last at the same time
			//check if the left and right sums are equal at any point of time
			
			if(rightSum == leftSum)
				return j;
			else{
				rightSum += A[j];
				leftSum -= A[j-1];
				--j;
			}		
		}//end of while (j >= 1)
		if(rightSum == leftSum)
			return j;
		
		return -1;
    }// end of solution
}
