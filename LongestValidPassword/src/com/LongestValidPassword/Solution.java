package com.LongestValidPassword;

public class Solution {
	public int solution(String S) {
        // write your code in Java SE 8
		int maxLen = -1;
		int tempLen = -1;
		int startIdx = 0;
		int i = 0;
		boolean isUpperFound = false;                    //Flag to check if there is at least one upper case letter in substring
		for(i = 0; i < S.length(); i++)
		{
		   char c = S.charAt(i);
		   
		   if(!isUpperFound)                            //If at least one upper case exists in sub string 
			   isUpperFound = Character.isUpperCase(c); //then no need to check for other  
			   		   
		   if(Character.isDigit(c)) {                   //If we encounter a digit then consider this end of substring 
			   if(isUpperFound)                         //and check the length and upper case condition
			      tempLen = i-startIdx;
			   
			   startIdx = i+1;
			   
			   if(tempLen > maxLen)
				   maxLen = tempLen;
			   
			   isUpperFound = false;
		   }
		}
		
		if(!Character.isDigit(S.charAt(S.length()-1))) {  //This is because program should consider the substring 
			                                              // at the end of the string also. Checking if it is valid
			if(isUpperFound)
				tempLen = i-startIdx;
			
			if(tempLen > maxLen)
				maxLen = tempLen;
		}
		
		return maxLen;
    }
}
