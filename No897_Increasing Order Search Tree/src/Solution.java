import java.util.ArrayList;

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
	public TreeNode increasingBST(TreeNode root) {
        ArrayList<TreeNode> list = tree(root);
        for (int i = 0; i < list.size(); i++) {
        	if (i!=list.size()-1) {
        		list.get(i).right=list.get(i+1);
			}else {
				list.get(i).right=null;
			}
        	list.get(i).left=null;
		}
        return list.get(0);
    }
    public ArrayList<TreeNode> tree(TreeNode root) {
        ArrayList<TreeNode> list = new ArrayList();
        list.add(root);
        if (root.left!=null) {
        	ArrayList<TreeNode> li =tree(root.left);
        	list.addAll(0, li);
		}
        if (root.right!=null) {
        	ArrayList<TreeNode> li =tree(root.right);
        	list.addAll(li);
		}
        return list;
    }
}