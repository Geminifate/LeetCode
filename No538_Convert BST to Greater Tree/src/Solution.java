import java.util.ArrayList;
import java.util.Arrays;
import java.util.TreeMap;

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
    public TreeNode convertBST(TreeNode root) {
    	if (root==null) {
			return null;
		}
    	ArrayList<TreeNode> list=BSTList(root);
        TreeMap<Integer, Integer> map =new TreeMap();
        int count=0;
        int[] nums = new int[list.size()];
        for (int i = 0; i < list.size(); i++) {
        	nums[i]=list.get(i).val;
        	count+=nums[i];
		}
        Arrays.sort(nums);
        for (int i = 0; i < nums.length; i++) {
        	map.put(nums[i], count);
            count-=nums[i];
		}
        for (int i = 0; i < list.size(); i++) {
        	list.get(i).val=map.get(list.get(i).val);
		}
        return list.get(0);
    }

	public ArrayList<TreeNode> BSTList(TreeNode root) {
		// TODO Auto-generated method stub
		ArrayList<TreeNode> list = new ArrayList();
		if (root==null) {
			return null;
		}
		list.add(root);
		ArrayList<TreeNode> left = BSTList(root.left);
		ArrayList<TreeNode> right = BSTList(root.right);
		if (left!=null) {
			list.addAll(left);
		}
		if (right!=null) {
			list.addAll(right);
		}
		return list;
	}
}