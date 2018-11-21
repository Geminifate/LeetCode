/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
//本题感觉题目有些问题的
public class Solution {
    public TreeNode trimBST(TreeNode root, int L, int R) {
    	if (root==null) {
			return null;
		}
        if (root.val<=R&&root.val>=L) {
        	root.left =trimBST(root.left,L,R);
        	root.right =trimBST(root.right,L,R);
            System.out.println(root);
		}else {
			if(trimBST(root.left,L,R)==null) {
				root=trimBST(root.right,L,R);
			}else {
                root=trimBST(root.left,L,R);
            }
            
		}
        return root;
    }
}