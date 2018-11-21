import java.util.ArrayList;
import java.util.List;

/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
public class Solution {
    public List<String> binaryTreePaths(TreeNode root) {
    	if (root==null) {
			return new ArrayList<>();
		}
        List<String> list = new ArrayList<>();
        
        List<String> li1 = binaryTreePaths(root.left);
        if (li1!=null) {
        	for (int i = 0; i < li1.size(); i++) {
				li1.set(i, ""+root.val+"->"+li1.get(i));
			}
        	list.addAll(li1);
		}
        
        List<String> li2 = binaryTreePaths(root.right);
        if (li2!=null) {
        	for (int i = 0; i < li2.size(); i++) {
				li2.set(i,root.val+"->"+li2.get(i));
			}
        	list.addAll(li2);
		}
        if (list.isEmpty()) {
            list.add(root.val+"");
			return list;
		}
        return list;
    }
}