import java.util.ArrayList;
import java.util.List;

/*
// Definition for a Node.
class Node {
    public int val;
    public List<Node> children;

    public Node() {}

    public Node(int _val,List<Node> _children) {
        val = _val;
        children = _children;
    }
};
*/
public class Solution {
    public List<List<Integer>> levelOrder(Node root) {
    	List<List<Integer>> list = new ArrayList<List<Integer>>();
    	List<List<Integer>> list2;
    	List<Integer> li = new ArrayList<>();
    	boolean status=true;
    	if (root==null) {
			return new ArrayList<List<Integer>>();
		}
    	li.add(root.val);
    	list.add(li);
    	List<List<Integer>> list1=null;
    	for (int i = 0; i < root.children.size(); i++) {      
    		list2 = levelOrder(root.children.get(i));
    		if (list1!=null&&list2!=null) {
                if(list1.size()>=list2.size()){
                    int j=0;
                    while(j<list2.size()){
                        list1.get(j).addAll(list2.get(j));
                        j++;
                    }
                }else{
                    int j=0;
                    while(j<list2.size()){
                        if(j<list1.size()){
                            list1.get(j).addAll(list2.get(j));
                            j++;
                        }else{
                            list1.add(list2.get(j));
                            j++;
                        }
                    }
                }  	
			}else if (list1==null) {
				list1=list2;
			}
		}
        if (list1!=null) {
				list.addAll(list1);
			}
    	return list;
    }
}