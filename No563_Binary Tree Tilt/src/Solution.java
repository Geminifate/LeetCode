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
	public int sum=0;
    public int findTilt(TreeNode root) {
    	subTree(root);
        return sum;
    }
    public int subTree(TreeNode root) {
        if (root==null) {
			return 0;
		}
        int left = subTree(root.left);
        int right = subTree(root.right);
        sum+=Math.abs(right-left);
        return root.val+left+right;
    }
}