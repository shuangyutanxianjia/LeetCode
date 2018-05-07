package linklist;

import util.ListNode;

/**
 * 删除链表的倒数第N个节点
 * @author Administrator
 *
 */
public class A19 {
	public ListNode removeNthFromEnd(ListNode head, int n) {
		ListNode p = head;
        ListNode q = head;
        int i = 0;
        while(i<n){
        	p = p.next;
        	i++;
        }
        if(p == null)
            return head.next;
        //查找第N+1个结点
    	while(p.next!= null){
    		p = p.next;
    		q = q.next;
    	}
    	q.next = q.next.next;    	
    	return head;
	}
}
