import java.util.Stack;

import util.TreeNode;
/**
 * 请实现一个函数，检查一棵二叉树是否为二叉查找树。

	给定树的根结点指针TreeNode* root，请返回一个bool，代表该树是否为二叉查找树。
 * @author Administrator
 *
 */
public class Checker {
	public boolean checkBST(TreeNode root) {		
		if(root == null) return true;
		Stack<TreeNode> chkstack = new Stack<>();
		TreeNode p = root;
		int pre =0;
		boolean isFirst = true;
		while(p!=null || !chkstack.isEmpty()){
			while(p!=null){
				chkstack.push(p);
				p = p.left;
			}
			p = chkstack.pop();
			if(isFirst){ //中序遍历开始节点，便于后续比较
				pre = p.val;
				isFirst = false;
			}else if(pre >= p.val){
				return false;
			}else{
				pre = p.val;
			}
			p = p.right;
		}
		return true;
    }
}
