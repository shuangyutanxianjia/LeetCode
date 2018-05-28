import util.ListNode;

public class Partition {
	public static ListNode partition(ListNode pHead, int x) {
        // write code here
		if(pHead == null ||pHead.next == null) return pHead;
		ListNode smallL = new ListNode(-1);
		ListNode bigL = new ListNode(-1);
		ListNode p = pHead;
		ListNode s = smallL;
		ListNode b = bigL;
		while(p!=null){
			if(p.val <x){
				s.next = new ListNode(p.val);
				s = s.next;
			}else{
				b.next = new ListNode(p.val);
				b = b.next;
			}
			p = p.next;
		}
		p = smallL;
		while(p.next != null && p.next.val != -1){
			p = p.next;
		}
		p.next = bigL.next;
		return smallL.next;	   
    }
	
	
}
