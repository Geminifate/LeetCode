/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
public class Solution {
    public ListNode middleNode(ListNode head) {
    	if (head==null) {
			return null;
		}
        int len=0;
        ListNode node = head;
        while (node!=null) {
        	len++;
        	node =node.next;
		}
        len=len/2;
        node = head;
        while (len>0) {
			node=node.next;
            len--;
		}
        return node;
    }
}
