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
        ListNode fast = head;
        ListNode slow = head;
   // Move fast by 2 steps and slow by 1 step,Stop if fast reaches the end (no cycle)
        while(fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;

            if(fast == slow){ // If both pointers meet,cycle is exists
                return true;
            }
        }                             //TC:O(n)   //SC:O(1)
        return false;
    }
}