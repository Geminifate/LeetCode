import java.util.ArrayList;

import javax.swing.tree.TreeNode;

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
    public boolean isSameTree(TreeNode p, TreeNode q) {
        if (p==null&&q==null) {
			return true;
		}else if (p==null^q==null) {
        	return false;
		}
        boolean value= (p.val==q.val);
        boolean left = isSameTree(p.left,q.left);
        boolean right= isSameTree(p.right,q.right);
        if (left&&right&&value) {
			return true;
		}
        return false;
    }
}