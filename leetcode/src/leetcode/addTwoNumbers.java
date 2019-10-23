package leetcode;

public class addTwoNumbers {
	 public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
	        
	        int carry = 0;
	        ListNode currNode = new ListNode((l1.val + l2.val + carry) % 10);
	        ListNode rval = currNode;
	        carry = (l1.val + l2.val) / 10 ;
	        
	        while(l1.next != null && l2.next != null){
	            l1 = l1.next;
	            l2 = l2.next;
	            currNode.next = new ListNode((l1.val + l2.val + carry) % 10);
	            carry = (l1.val + l2.val + carry) / 10;
	            currNode = currNode.next;
	        }
	        while(l1.next != null){
	            l1 = l1.next;
	            currNode.next = new ListNode((l1.val + carry) % 10);
	            carry = (l1.val + carry) / 10;
	            currNode = currNode.next;
	        }
	        while(l2.next != null){
	            l2 = l2.next;
	            currNode.next = new ListNode((l2.val + carry) % 10);
	            carry = (l2.val + carry) / 10;
	            currNode = currNode.next;
	        }
	        if(carry != 0){
	            currNode.next = new ListNode(carry);
	        }
	        return rval;
	    }
}
