import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import javafx.scene.Node;

/*
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
*/
public class Solution {
    public List<Integer> postorder(Node root) {
    	List<Integer> list = new ArrayList();
        if (root==null) {
			return list;
		}
        Iterator<Node> it = root.children.iterator();
        while (it.hasNext()) {
        	list.addAll(postorder(it.next()));
		}
         list.add(root.val);
        return list;
    }
}