import util.ListNode;
import util.TreeNode;

/**
 * 对于一棵二叉树，请设计一个算法，创建含有某一深度上所有结点的链表。

	给定二叉树的根结点指针TreeNode* root，以及链表上结点的深度，请返回一个链表ListNode，代表该深度上所有结点的值，请按树上从左往右的顺序链接，保证深度不超过树的高度，树上结点的值为非负整数且不超过100000。


 * @author Administrator
 *
 */
public class TreeLevel {
	ListNode ln = new ListNode(-1);
	ListNode p = ln;
	public ListNode getTreeLevel(TreeNode root, int dep) {
        // write code here
		if(root == null || dep <=0) return null;
		if(dep == 1){
			p.next = new ListNode(root.val);
			p = p.next;
		}else{
			getTreeLevel(root.left, dep-1);
			getTreeLevel(root.right, dep-1);
		}
		return ln.next;
    }
}
