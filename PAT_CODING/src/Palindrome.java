import java.util.Stack;

import util.ListNode;

/**
 * 请编写一个函数，检查链表是否为回文。

	给定一个链表ListNode* pHead，请返回一个bool，代表链表是否为回文。
 * @author Administrator
 * 快慢指针解决单链表问题 很棒
 *
 */
public class Palindrome {
	public static boolean isPalindrome(ListNode pHead) {
        // write code here
		if(pHead == null || pHead.next ==null) return true;
		Stack<Integer> checkstack = new Stack<>();
		ListNode p = pHead;
		ListNode q = pHead;
		checkstack.push(p.val);
		while(p.next!=null && q.next!=null && q.next.next!=null){
			p = p.next;
			checkstack.push(p.val);
			q = q.next.next;
		}
		if(q.next == null){
			checkstack.pop();
		}
		p = p.next;
		while(!checkstack.isEmpty()){
			if(checkstack.pop()!=p.val) return false;
			p = p.next;
		}
		return true;		
    }
	
	public static void main(String[] args) {
		ListNode pHead = new ListNode(1);
		ListNode l1 = new ListNode(2);
		ListNode l2 = new ListNode(3);
		ListNode l3 = new ListNode(2);
		ListNode l4 = new ListNode(1);
		pHead.next = l1;
		l1.next = l2;
		l2.next = l3;
		l3.next = l4;
		System.out.println(Palindrome.isPalindrome(pHead));
	}
}
