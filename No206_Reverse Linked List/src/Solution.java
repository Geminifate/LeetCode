import java.util.List;

/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
public class Solution {
    public ListNode reverseList(ListNode head) {
    	if(head==null){
            return null;
        }
        List<ListNode> list = new ArrayList();
        ListNode node = head;
        while(node!=null){
            list.add(node);
            node=node.next;
        }
        for(int i=0;i<list.size()/2;i++){
            int tem = list.get(list.size()-1-i).val;
            list.get(list.size()-1-i).val = list.get(i).val;
            list.get(i).val = tem;
        }
        return list.get(0);
    }
}