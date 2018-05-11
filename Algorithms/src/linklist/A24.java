package linklist;

import util.ListNode;

public class A24 {
	 public ListNode swapPairs(ListNode head) {
		 if(head == null || head.next==null) return head;
		 ListNode p = head;
		 ListNode q = head.next;
		 //确保奇数个
		 while(q!=null){
			 int temp = p.val;
			 p.val = q.val;
			 q.val = temp;
			 //确保偶数个
			 if(q.next == null) break;
			 p = q.next;
			 q = p.next;
		 }
	    return head;
	 }
}
