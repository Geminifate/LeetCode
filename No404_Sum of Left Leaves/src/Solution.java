import java.util.ArrayList;

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
    public int sumOfLeftLeaves(TreeNode root) {
    	int count=0;
        if (root==null) {
			return 0;
		}else if (root.left!=null&&root.left.left==null&&root.left.right==null){
			count+=root.left.val;
		}
        int left=sumOfLeftLeaves(root.left);
		int right=sumOfLeftLeaves(root.right);
		count+=(left+right);
        return count;
    }
}