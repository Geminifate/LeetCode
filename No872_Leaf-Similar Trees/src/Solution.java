import java.util.ArrayList;
import java.util.List;

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
    public boolean leafSimilar(TreeNode root1, TreeNode root2) {
    	if (root1==null&&root2==null) {
			return true;
		}
    	ArrayList<Integer> tree1 = leaf(root1);
    	ArrayList<Integer> tree2 = leaf(root2);
    	if (tree1.equals(tree2)) {
			return true;
		}
        return false;
    }
    public ArrayList<Integer> leaf(TreeNode root){
    	if (root==null) {
			return null;
		}
    	ArrayList<Integer> list = new ArrayList();
    	ArrayList<Integer> li;
    	if (root.left==null&&root.right==null) {
			list.add(root.val);
			return list;
		}
    	if (root.left!=null) {
    		li=leaf(root.left);
    		if (li!=null) {
    			list.addAll(li);
			}
		}
    	if (root.right!=null) {
    		li=leaf(root.right);
    		if (li!=null) {
    			list.addAll(li);
			}
		}
    	return list;
    }
}