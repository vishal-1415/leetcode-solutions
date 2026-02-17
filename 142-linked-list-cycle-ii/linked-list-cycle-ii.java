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
    public ListNode detectCycle(ListNode head) {
        ListNode slow = head;
        ListNode fast = head;
                               
        while (fast != null && fast.next != null) {   //Floyd’s Cycle Detection + cycle entry finding
            slow = slow.next;
            fast = fast.next.next;

            if (slow == fast) { 

                while (head != slow) {
                    slow = slow.next;
                    head = head.next;
                }
                return slow;
            }
        }
        return null;
    }
}