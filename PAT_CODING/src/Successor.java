import java.util.Stack;

import util.TreeNode;

/**
 * 请设计一个算法，寻找二叉树中指定结点的下一个结点（即中序遍历的后继）。

	给定树的根结点指针TreeNode* root和结点的值int p，请返回值为p的结点的后继结点的值。保证结点的值大于等于零小于等于100000且没有重复值，若不存在后继返回-1
 * @author Administrator
 *
 */
public class Successor {
	public int findSucc(TreeNode root, int p) {
        // 中序遍历
		TreeNode chk = root;
		boolean chkflag = false;
		int result = -1;
		Stack<TreeNode> chkstack = new Stack<>();
		while(chk!= null || !chkstack.isEmpty()){
			while(chk!=null){
				chkstack.push(chk);
				chk = chk.left;
			}
			chk = chkstack.pop();
			if(!chkflag){
				if(chk.val == p) chkflag = true;				
			}else{
				result = chk.val;
				break;
			}
			chk = chk.right;
		}
		return result;
    }
}
