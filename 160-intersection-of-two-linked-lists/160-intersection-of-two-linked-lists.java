/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        ListNode currA = headA;
        HashSet<ListNode> hs = new HashSet<>();
        while(currA!=null){
            hs.add(currA);
            currA = currA.next;
        }
        
        ListNode currB = headB;
        while(currB!=null){
            if(hs.contains(currB)){return currB;}
            currB = currB.next;
        }
        return null;
    }
}