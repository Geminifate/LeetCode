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
	public boolean isSymmetric(TreeNode root) {
        if (root==null) {
			return true;
		}
        return Symmetric(root.left,root.right);
    }
    public boolean Symmetric(TreeNode left,TreeNode right) {
    	boolean bo=true;
        if ((left==null)^(right==null)) {
			return false;
		}else if ((left==null)&&(right==null)) {
			return true;
		}
        
        if (left.val!=right.val) {
			bo=false;
		}
        boolean le = Symmetric(left.left,right.right);
        boolean ri = Symmetric(left.right,right.left);
        return bo&&le&&ri;
    }
}