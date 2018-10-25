import java.util.Arrays;

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
    public TreeNode sortedArrayToBST(int[] nums) {
    	if (nums.length==0) {
			return null;
		}
        TreeNode root = new TreeNode(nums[nums.length/2]);
    	if (nums.length>2) {
            int[] le = new int[nums.length/2];
    	    int[] ri = new int[nums.length/2-1];
    		le = Arrays.copyOfRange(nums, 0, nums.length/2);
    		ri = Arrays.copyOfRange(nums, nums.length/2+1, nums.length);
    		root.left  = sortedArrayToBST(le);
            root.right = sortedArrayToBST(ri);
		}else if (nums.length==2) {
			int[] le = new int[1];
			le = Arrays.copyOfRange(nums, 0, nums.length/2);
			root.left  = sortedArrayToBST(le);
		}
        return root;
    }
}