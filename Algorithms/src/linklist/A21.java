package linklist;

import util.ListNode;

/**
 * 合并两个有序链表
 * @author Administrator
 *
 */
public class A21 {
	public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        ListNode result = new ListNode(0);
        ListNode pre = result;
		if(l1 == null) return l2;
        if(l2 == null) return l1;
        while(l1!= null && l2 != null){
        	if(l2.val<=l1.val){
        		pre.next = l2;
        		l2 = l2.next;
        	}else{
        		pre.next = l1;
        		l1 = l1.next;
        	}
        	pre = pre.next;
        }
        if(l1!=null){
        	pre.next = l1;
        }
        if(l2!=null){
        	pre.next = l2;
        }
        return result.next;
    }
	
	public static void main(String[] args) {
		ListNode l1 = new ListNode(1);
		ListNode l12 = new ListNode(2);
		ListNode l13 = new ListNode(4);
		ListNode l2 = new ListNode(1);
		ListNode l22 = new ListNode(3);
		ListNode l23 = new ListNode(4);
		l1.next = l12;
		l12.next = l13;
		l2.next = l22;
		l22.next = l23;
		A21 a= new A21();
		ListNode result = a.mergeTwoLists(l1,l2);
		while(result!= null){
			System.out.println(result.val);
			result = result.next;
		}
	}
}
