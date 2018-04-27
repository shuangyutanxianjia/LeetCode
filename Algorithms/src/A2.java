import util.ListNode;

public class A2 {
	public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
		ListNode result = new ListNode(0);
		ListNode curr = result;
		if(l1 == null && l2 != null) return l2;
		if(l2 == null && l1 != null) return l1;
		if(l2 == null && l1 == null) return null;
		int add = 0;
		while(l1 != null || l2 != null){
				int x=(l1!=null)?l1.val:0;  
	            int y=(l2!=null)?l2.val:0;  
				int sum = x+y+add;
				add = sum/10;
				curr.next = new ListNode(sum%10);		
				curr = curr.next;
				if(l1 != null) l1= l1.next;
				if(l2 != null) l2=l2.next;
		}
		
		if(add>0){
			curr.next = new ListNode(add); 
		}
		return result.next;		
    }
	
	
}
