package com.AddTwoNum;

import java.util.ArrayList;
import java.util.List;

public class Solution {
public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
      
	  ListNode lResult = null,lTemp = null;
	  
      int carryForward = 0;
      int currVal = 0;
      
      List<Integer> tempVals = new ArrayList<Integer>();   // list to store the result temporarily.
      
      while(l1 != null || l2 != null) {
    	  
    	  int val1 = 0, val2 = 0;
    	  
    	  if(l1 != null)
    		  val1 = l1.val;
    	  if(l2 != null)
    	      val2 = l2.val;
    	  
    	  currVal = val1+val2;
    	  
    	  tempVals.add((currVal+carryForward) % 10);   	
    	  carryForward = (currVal+carryForward) / 10;
    	  
    	  if(l1 != null)
    		  l1 = l1.next;
    	  if(l2 != null)
    		  l2 = l2.next; 	  
      }
      
      if(carryForward != 0)
    	  tempVals.add(carryForward);
      
      if(tempVals.size() > 0)
      {
    	  lTemp = new ListNode(tempVals.get(tempVals.size()-1));
    	  lResult = lTemp;
      }
      
      for(int i = tempVals.size()-2 ; i>=0 ; i--) {
    	  lResult      = new ListNode(tempVals.get(i));
    	  lResult.next = lTemp;
    	  lTemp        = lResult;
      }
      
      return lResult;
    }
      
}
