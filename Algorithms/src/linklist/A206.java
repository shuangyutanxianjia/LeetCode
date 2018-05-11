package linklist;
import util.ListNode;

public class A206 {
//	public ListNode reverseList(ListNode head) {
//        if(head == null || head.next ==null)
//        	return head;
//		ListNode p =head,q= head;
//		while(head.next != null){
//			p = head.next;
//			head.next = p.next;
//			p.next = q;
//			q = p;
//		}
//        return p;       
//    }
	public ListNode reverseList(ListNode head){
		if(head == null || head.next == null) return head;
		ListNode list = head;
		ListNode p = head;
		ListNode q = head;
		while(list.next!=null){
			p = list.next;
			list.next = p.next;
			p.next = q;
			q = p;
		}
		return p;
	}
	
	public static void main(String[] args) {
		A206  a = new A206();
		ListNode head = new ListNode(1);
		ListNode first = new ListNode(2);
		ListNode second = new ListNode(3);
		ListNode third = new ListNode(4);
		head.next = first;
		first.next = second;
		second.next = third;
		while(head!=null){
			System.out.println(head.val);
			head = head.next;
		}
		
		ListNode M = a.reverseList(head);
		while(M!=null){
			System.out.println(M.val);
			M = M.next;
		}
	}
	
}
