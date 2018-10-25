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
    public List<List<Integer>> levelOrderBottom(TreeNode root) {
    	 if (root==null) {
 			return new ArrayList<List<Integer>>();
 		}
         List<List<Integer>> list = new ArrayList<List<Integer>>();
         
     	List<List<Integer>> list1 = levelOrderBottom(root.left);
     	List<List<Integer>> list2 = levelOrderBottom(root.right);
     	
     	if (list1==null&&list2!=null) {
     		list.addAll(list2);
 		}if (list1!=null&&list2==null) {
     		list.addAll(list1);
 		}if (list1!=null&&list2!=null) {
 			int count =list1.size()>list2.size()?list1.size():list2.size();    	
 	    	for (int i=0;i<count;i++) {
 	    		int index1=list1.size()-i-1;
 	    		int index2=list2.size()-i-1;
 	    		if (index1>=0&&index2>=0) {
 	    			list1.get(index1).addAll(list2.get(index2));
 	    			list.add(0,list1.get(index1));
 				}else if (index1<0) {
 					list.add(0,list2.get(index2));
 				}else if (index2<0) {
 					list.add(0,list1.get(index1));
 				}
 			} 
 		}
     	List<Integer> li = new ArrayList<>();
         li.add(root.val);
     	list.add(li);
         return list;
    }
}