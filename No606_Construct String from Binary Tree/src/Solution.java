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
    public String tree2str(TreeNode t) {
    	if (t==null) {
			return "";
		}
        String str =""+t.val;
        String s1 = tree2str(t.left);
        String s2 = tree2str(t.right);
        if (s2==""&&s1=="") {
			return str;
		}else if (s2==""&&s1!="") {
			return str+="("+s1+")";
		}
        str+="("+s1+")("+s2+")";
        return str;
    }
}