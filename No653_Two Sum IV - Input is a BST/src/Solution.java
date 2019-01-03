import java.util.ArrayList;
import java.util.Arrays;

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
    public boolean findTarget(TreeNode root, int k) {
        ArrayList<Integer> list = BST(root);
        Integer[] value = list.toArray(new Integer[list.size()]);
        Arrays.sort(value);
        for (int i = 0; i < value.length; i++) {
        	if ((k-value[i])<=value[i]) {
				continue;
			}
			if (list.contains(k-value[i])) {
				return true;
			}
		}
        return false;
    }
    public ArrayList<Integer> BST(TreeNode root) {
        if (root==null) {
			return null;
		}
        ArrayList<Integer> list = new ArrayList();
        list.add(root.val);
        ArrayList<Integer> left = BST(root.left);
        ArrayList<Integer> right = BST(root.right);
        if (left!=null) {
			list.addAll(left);
		}
        if (right!=null) {
			list.addAll(right);
		}
        return list;
    }
}