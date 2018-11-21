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
    public TreeNode searchBST(TreeNode root, int val) {
        if (root==null) {
			return null;
		}else if (root.val==val) {
			return root;
		}
        TreeNode str1 = searchBST(root.left,val);
        TreeNode str2 = searchBST(root.right,val);
        if (str1 != null ) {
        	return str1;
		}
        return str2;
    }
}