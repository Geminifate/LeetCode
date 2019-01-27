import java.util.ArrayList;
import java.util.Arrays;
import java.util.TreeSet;

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
    public int findSecondMinimumValue(TreeNode root) {
    	ArrayList<Integer> list =findSecond(root);
    	Integer[] res = list.toArray(new Integer[list.size()]);
    	Arrays.sort(res);
    	int mini=res[0];
    	for (int i = 1; i < res.length; i++) {
			if (mini<res[i]) {
				return res[i];
			}
		}
    	return -1;
    }
    public ArrayList<Integer> findSecond(TreeNode root) {
    	ArrayList<Integer> list = new ArrayList();
    	list.add(root.val);
    	if (root.left!=null) {
    		ArrayList<Integer> left = findSecond(root.left);
    		ArrayList<Integer> right = findSecond(root.right);
    		list.addAll(left);
    		list.addAll(right);
		}
    	return list;
    }
}