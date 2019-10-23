package leetcode;

import java.util.ArrayList;

//must use constant memory
public class reverseNodesInKGroup {

	public static void main(String[] args) {
		var q = new ArrayList<Integer>();
		q.add(1);
		q.add(2);
		q.add(3);
		
		var w = q;
		var t = q;
	
		t.add(8);
		System.out.println(w);

	}
	
    public ListNode reverseKGroup(ListNode head, int k) {
        ListNode myNode = new ListNode(-1);
        ListNode swp = head;
        ListNode bwd = head;
        ListNode fwd = head;
        int i = 0;
        while(i < k){
            swp.next = head.next;
            i++;
        }
        while(i < k){
        }
            
        return swp;
            
    }
}
