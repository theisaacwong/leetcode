package leetcode;

import java.util.ArrayList;
import java.util.Collections;

public class mergeKLists {
    public ListNode mergeKLists(ListNode[] lists) {
        int n = lists.length;
        ArrayList<Integer> al = new ArrayList<Integer>();
        for(int i = 0; i < lists.length; i++){
            while(lists[i] != null){
                al.add(lists[i].val);
                lists[i] = lists[i].next;
            }
        }
        Collections.sort(al);
        //System.out.println(al.size());
        if(al.size()==0){return null;}
        int x = al.get(0);
        ListNode rval = new ListNode(x);
        ListNode currNode = rval;
        for(int i = 1; i < al.size(); i++){
            currNode.next = new ListNode(al.get(i));
            currNode = currNode.next;
            
        }
        return rval;
        
    }
}
