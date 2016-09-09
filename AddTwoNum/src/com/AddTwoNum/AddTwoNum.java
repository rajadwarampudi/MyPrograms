package com.AddTwoNum;

public class AddTwoNum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ListNode ls1 = new ListNode(8);
		ListNode ls2 = new ListNode(9);
        
		ls1.next = new ListNode(9);
		//ls2.next = new ListNode(6);
		
		//ls1.next.next = new ListNode(3);
		//ls2.next.next = new ListNode(4);
		
		Solution sol = new Solution();
		ListNode lResult = sol.addTwoNumbers(ls1, ls2);
		
		while(lResult != null) {
			System.out.println(lResult.val);
			lResult = lResult.next;
		}
		
	}

}
