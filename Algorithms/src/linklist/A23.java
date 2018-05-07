package linklist;

import java.util.ArrayList;
import java.util.List;

import util.ListNode;

public class A23 {
	public ListNode mergeKLists(ListNode[] lists) {
		//二路归并
		if(lists == null || lists.length ==0) return null;
        if(lists.length == 1) return lists[0];
        for(int step = 1;step<lists.length;step = step*2){
        	for(int i = 0;i<lists.length;i=i+2*step){
        		if(i+step>=lists.length){
        			continue;
        		}else{
        			lists[i] = mergeTwoLists(lists[i], lists[i+step]);
        			System.out.println("merge"+i+"和"+(i+step));
        		}        		
        	}
        }
        return lists[0];
    }
	
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
		ListNode l12 = new ListNode(4);
		ListNode l13 = new ListNode(5);
		ListNode l2 = new ListNode(1);
		ListNode l22 = new ListNode(3);
		ListNode l23 = new ListNode(4);
		ListNode l3 = new ListNode(2);
		ListNode l32 = new ListNode(6);
		ListNode l4 = new ListNode(4);
		ListNode l42 = new ListNode(8);
		l1.next = l12;
		l12.next = l13;
		l2.next = l22;
		l22.next = l23;
		l3.next = l32;
		l4.next = l42;
		ListNode []lists = {l1,l2,l3,l4};
		
		A23 b =new A23();
		ListNode r = b.mergeKLists(lists);
		while(r!= null){
			System.out.println(r.val);
			r = r.next;
		}
	}
}
