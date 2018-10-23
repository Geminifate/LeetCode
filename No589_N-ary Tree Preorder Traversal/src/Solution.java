import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

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
    public List<Integer> preorder(Node root) {
    	List<Integer> list = new ArrayList();
        if (root==null) {
			return list;
		}
        list.add(root.val);
        Iterator<Node> it = root.children.iterator();
        while(it.hasNext()) {
            	List<Integer> li = preorder(it.next());
            	list.addAll(li);
		}
        return list;
    }
}