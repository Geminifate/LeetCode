import java.util.ArrayList;
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
    public int minDiffInBST(TreeNode root) {
        ArrayList<Integer> tree = nodes(root);
        Integer[] list = tree.toArray(new Integer[tree.size()]);
        int[] num = new int[tree.size()];
        Arrays.sort(list);
        int count=list[1]-list[0];
        for (int i = 1; i < list.length; i++) {
			if (count>list[i]-list[i-1]) {
				count=list[i]-list[i-1];
			}
		}
        return count;
    }

	private ArrayList<Integer> nodes(TreeNode root) {
		// TODO Auto-generated method stub
		ArrayList<Integer> list = new ArrayList();
        list.add(root.val);
        if (root.left!=null) {
        	ArrayList<Integer> li1 = nodes(root.left);
        	list.addAll(li1);
		}
        if (root.right!=null) {
        	ArrayList<Integer> li1 = nodes(root.right);
        	list.addAll(li1);
		}
		return list;
	}
}
