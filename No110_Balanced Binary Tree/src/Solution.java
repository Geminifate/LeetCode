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
    public boolean isBalanced(TreeNode root) {
    	reBuild(root);
    	if (root==null) {
			return true;
		}
        
    	if (root.val==-1) {
			return false;
		}
    	return true;
    }
    public int reBuild(TreeNode root) {
    	if (root==null) {
			return 0;
		}
    	int left=reBuild(root.left);
    	int right=reBuild(root.right);
    	if (left==-1||right==-1||Math.abs(left-right)>1) {
            root.val=-1;
			return -1;
		}
    	root.val=Math.max(left, right)+1;
    	return root.val;
    }
}