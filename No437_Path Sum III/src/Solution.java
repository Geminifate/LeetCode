import java.util.ArrayList;
import java.util.List;

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
	int count = 0;
    public int pathSum(TreeNode root, int sum) {
        if(root==null){return 0;}
        sum(root,sum);
        pathSum(root.left,sum);
        pathSum(root.right,sum);
        return count;
    }

    public void sum(TreeNode root, int num){
        if(root==null){return ;}
        num-=root.val;
        if(num==0){count++;}
        if(root.left!=null){
            sum(root.left,num);
        }
        if(root.right!=null){
            sum(root.right,num);
        }
    }
}
//This question needs a change of thought, otherwise it will be very complicated