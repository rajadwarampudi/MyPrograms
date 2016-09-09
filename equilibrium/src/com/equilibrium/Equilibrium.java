package com.equilibrium;

import java.io.IOException;

public class Equilibrium {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		        
        Solution sol = new Solution();
        
        int A[] = {1,2,3,4,8,-8,8,4,1,3,2};
        System.out.println(sol.solution(A));
        
        int B[] = {1,2,3,4};
        System.out.println(sol.solution(B));
        
        int C[] = {1,2,-1,-2,9};
        System.out.println(sol.solution(C));
        
        int D[] = {9,1,2,-1,-2};
        System.out.println(sol.solution(D));
        
        
	}

}
