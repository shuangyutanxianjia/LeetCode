package util;

import java.util.ArrayList;

public class UndirectedGraphNode {
	int label = 0;
    UndirectedGraphNode left = null;
    UndirectedGraphNode right = null;
    public ArrayList<UndirectedGraphNode> neighbors = new ArrayList<UndirectedGraphNode>();

    public UndirectedGraphNode(int label) {
        this.label = label;
    }
}
