import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;
import java.util.Queue;
import java.util.Stack;

import util.UndirectedGraphNode;
/**
 * 对于一个有向图，请实现一个算法，找出两点之间是否存在一条路径。

	给定图中的两个结点的指针UndirectedGraphNode* a,UndirectedGraphNode* b(请不要在意数据类型，图是有向图),请返回一个bool，代表两点之间是否存在一条路径(a到b或b到a)。


 * @author Administrator
 *
 */
public class Path {
	public boolean checkPath(UndirectedGraphNode a, UndirectedGraphNode b) {
        //深度遍历（DFS）
		return DFSStackChk(a, b) || DFSStackChk(b,a);
		//广度遍历（BFS）
		
    }
	
	//DFS 非递归
	public boolean DFSStackChk(UndirectedGraphNode p,UndirectedGraphNode q){
		Stack<UndirectedGraphNode> nodestack = new Stack<>();
		Map<UndirectedGraphNode, Boolean> visitmap = new HashMap<>();
		nodestack.push(p);
		visitmap.put(p, true);
		while(!nodestack.isEmpty()){
			UndirectedGraphNode top = nodestack.peek();
			boolean needpop = true;
			for (UndirectedGraphNode neighbor : top.neighbors) {
				if(!visitmap.containsKey(neighbor)){
					nodestack.push(neighbor);
					visitmap.put(neighbor, true);
					needpop = false;
					break;
				}
			}
			if(needpop) nodestack.pop();
		}
		
		if(visitmap.containsKey(q)) return true;
		else return false;
	}
	
	//DFS 递归
	public boolean DFSChk(UndirectedGraphNode p,UndirectedGraphNode q){
		Map<UndirectedGraphNode, Boolean> visitmap = new HashMap<>();
		visitmap.put(p, true);
		if(p == q) return true;
		if(p == null || q == null) return false;
		for (UndirectedGraphNode neighbor : p.neighbors) {
			if(!visitmap.containsKey(neighbor) && DFSChk(neighbor,q)) return true;
		}
		return false;	
	}
	
	//BFS
	public boolean BFSQueueChk(UndirectedGraphNode p,UndirectedGraphNode q){
		Map<UndirectedGraphNode,Boolean> visitmap = new HashMap<>();
		Queue<UndirectedGraphNode> nodequeue = new LinkedList<>();
		visitmap.put(p, true);
		nodequeue.offer(p);
		while(!nodequeue.isEmpty()){
			for (UndirectedGraphNode neighbor : p.neighbors) {
				if(!visitmap.containsKey(neighbor)){
					if(neighbor == q) return true;
					nodequeue.offer(neighbor);
					visitmap.put(neighbor, true);
				}
			}
		}
		return false;
	}
	
}
