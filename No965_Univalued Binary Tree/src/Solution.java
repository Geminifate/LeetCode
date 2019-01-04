import java.util.TreeSet;

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
    public boolean isUnivalTree(TreeNode root) {
    	boolean res = compareNode(root,root.val);
        return res;
    }
    public boolean compareNode(TreeNode root,int value) {
    	if (root==null) {
			return true;
		} 
    	if (root.val==value) {
			boolean res1=compareNode(root.left,value);
			boolean res2=compareNode(root.right,value);
			if (res1&&res2) {
				return true;
			}
		}
        return false;
    }
}