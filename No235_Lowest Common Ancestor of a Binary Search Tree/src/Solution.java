import java.util.ArrayList;
import java.util.List;

import javax.print.attribute.Size2DSyntax;
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
	public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
    	ArrayList<ArrayList<TreeNode>> list = treePath(root);
    	List<TreeNode> P_link = new ArrayList();
    	List<TreeNode> q_link = new ArrayList();
        for (int i = 0; i < list.size(); i++) {
			if (list.get(i).contains(p)) {
				int index = list.get(i).indexOf(p);
				P_link=list.get(i).subList(0, index+1);
			}
			if (list.get(i).contains(q)) {
				int index = list.get(i).indexOf(q);
				q_link=list.get(i).subList(0, index+1);
			}
		}
        int len = P_link.size()<q_link.size()? P_link.size(): q_link.size();
        for (int i = 0; i < len; i++) {
			if (P_link.get(i)!=q_link.get(i)) {
				return P_link.get(i-1);
			}
		}
        return P_link.get(len-1);
    }

	private ArrayList<ArrayList<TreeNode>> treePath(TreeNode root) {
		// TODO Auto-generated method stub
		if (root==null) {
			return new ArrayList();
		}
		ArrayList<ArrayList<TreeNode>> list = new ArrayList();
		ArrayList<ArrayList<TreeNode>> li1 = treePath(root.left);
        if (li1!=null) {
        	for (int i = 0; i < li1.size(); i++) {
        		li1.get(i).add(0,root);
			}
        	list.addAll(li1);
		}
        
        ArrayList<ArrayList<TreeNode>> li2 = treePath(root.right);
        if (li2!=null) {
        	for (int i = 0; i < li2.size(); i++) {
				li2.get(i).add(0,root);
			}
        	list.addAll(li2);
		}
        if (list.isEmpty()) {
        	ArrayList<TreeNode> li =new ArrayList();
        	li.add(root);
            list.add(li);
			return list;
		}
        return list;
	}
}