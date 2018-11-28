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
    public List<Double> averageOfLevels(TreeNode root) {
    	List<Double> list = new ArrayList<>();
        List<TreeNode> tree = new ArrayList<>();
        tree.add(root);
        while (!tree.isEmpty()) {
        	double sum=0;
        	int count = tree.size();
        	for (int i = 0; i < count; i++) {
				sum+=tree.get(i).val;
				
				if (tree.get(i).left!=null) {
					tree.add(tree.get(i).left);
				}
				if (tree.get(i).right!=null) {
					tree.add(tree.get(i).right);
				}
			}
        	list.add(sum/count);
        	tree=tree.subList(count, tree.size());
		}

        return list;
    }
}