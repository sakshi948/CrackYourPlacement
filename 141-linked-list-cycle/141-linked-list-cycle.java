/**
 * Definition for singly-linked list.
 * class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public boolean hasCycle(ListNode head) {
        ListNode curr = head;
        while(curr!=null){
            if(curr.val==1000000){return true;}
            curr.val=1000000;
            curr = curr.next;
        }
        return false;
    }
}