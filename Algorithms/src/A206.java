import util.ListNode;

public class A206 {
	public ListNode reverseList(ListNode head) {
        if(head == null || head.next ==null)
        	return head;
		ListNode p =head,q= head;
		while(head.next != null){
			p = head.next;
			head.next = p.next;
			p.next = q;
			q = p;
		}
        return p;       
    }
	
}
