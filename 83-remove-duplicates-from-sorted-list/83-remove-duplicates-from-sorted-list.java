/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode deleteDuplicates(ListNode head) {
		if(head==null || head.next==null) return head;
		ListNode curr = head;
		ListNode next = curr.next;
		while(next!=null) {
			if(next.val!=curr.val) {
				curr.next=next;
				curr=next;
			}
			next=next.next;
		}
		curr.next=next;
		return head;
	}
}