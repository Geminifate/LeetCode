import java.util.Iterator;
import java.util.List;


// Definition for a Node.
class Node {
    public int val;
    public List<Node> children;

    public Node() {}

    public Node(int _val,List<Node> _children) {
        val = _val;
        children = _children;
    }
};

public class Solution {
    public int maxDepth(Node root) {
        if (root==null) {
			return 0;
		}
        int[] depth;
        Iterator<Node> it = root.children.iterator();
        while (it.hasNext()) {
        	depth= new int[root.children.size()];
            for (int i = 0; i < root.children.size(); i++) {
    			depth[i]=maxDepth(root.children.get(i));
    		}
            int max_depth=depth[0];
            for (int j = 1; j < depth.length; j++) {
    			if (depth[j]>max_depth) {
    				max_depth=depth[j];
    			}
    		}
            return max_depth+1;
		}
        return 1; 
    }
}
