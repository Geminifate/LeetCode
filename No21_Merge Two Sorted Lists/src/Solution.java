/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
public class Solution {
    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        ArrayList<Integer> li = new ArrayList<Integer>();
        while(l1!=null) {
        	li.add(l1.val);
            l1=l1.next;
		}
        while(l2!=null) {
        	li.add(l2.val);
            l2=l2.next;
		}
        li.sort(null);
        ListNode d = new ListNode(0);
        ListNode ptr = d;
        for(int item : li) {
            ptr.next = new ListNode(item);
            ptr = ptr.next;
        }
        return d.next;
    }
}